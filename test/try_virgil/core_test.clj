(ns try-virgil.core-test
  ;; Note: Java will not allow "-" as the package name
  (:import [try_virgil.SampleLib])
  (:require [clojure.test :refer :all]
            [try-virgil.core :refer :all]))

(deftest java-lib-test
  (testing "java-lib-test"
    (let [java-lib (try_virgil.SimpleLib.)]
      (is (= (.greeting java-lib "Max") "Hi there, Max")))))

(deftest hello-world-test
  (testing "Simple sanity test !"
    (is (= (hello-world) "Hello, World!"))
    (is (= (hello-world "Burin") "Hello, World! : Burin"))))

(deftest greeting-test
  (testing "greeting"
    (is (= (greeting "Burin") "Hello Burin"))))
