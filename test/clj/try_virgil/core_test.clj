(ns try-virgil.core-test
  (:import [try_virgil.SampleLib])
  (:require [clojure.test :refer :all]
            [try-virgil.core :refer :all]))

(deftest jvm-hello-tst
  (testing "greeting (Java)"
    (let [java-lib (try_virgil.SimpleLib.)]
      (is (= (.greeting java-lib "Max") "Hi there, Max")))))

(deftest clj-hello-test
  (testing "greeting (Clojure)"
    (is (= (greeting "Burin") "Hello there, Burin"))))
