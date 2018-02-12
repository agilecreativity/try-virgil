(ns try-virgil.core-test
  ;; Note: Java will not allow "-" as the package name
  (:import [try_virgil.SampleLib])
  (:require [clojure.test :refer :all]
            [try-virgil.core :refer :all]))

(deftest jvm-hello-tst
  (testing "jav-hello-test"
    (let [java-lib (try_virgil.SimpleLib.)]
      (is (= (.greeting java-lib "Max") "Hi there, Max")))))

(deftest clj-hello-test
  (testing "clj-hello-test"
    (is (= (clj-hello "Burin") "clj-hello : Burin"))))

(deftest hello-world-test
  (testing "Simple sanity test !"
    (is (= (hello-world) "Hello, World!"))
    (is (= (hello-world "Burin") "Hello, World! : Burin"))))

(deftest greeting-test
  (testing "greeting"
    (is (= (greeting "Burin") "Hello Burin"))))