(ns try-virgil.core-test
  (:import [try_virgil.JavaLib])
  (:require [clojure.test :refer :all]
            [try-virgil.core :refer :all]))

(deftest java-add-one-test
  (testing "adding one test"
    (let [java-lib (try_virgil.JavaLib.)]
      (is (= (.addOne java-lib 4) 5)))))

(deftest java-greeting-test
  (testing "greeting with Java"
    (let [java-lib (try_virgil.JavaLib.)]
      (is (= (.greeting java-lib "Burin") "Greeting from Java : Burin")))))

(deftest clojure-greeting-test
  (testing "greeting with Clojure"
    (is (= (greeting "Burin") "Greeting from Clojure : Burin"))))
