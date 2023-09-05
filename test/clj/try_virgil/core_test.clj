(ns try-virgil.core-test
  (:require [clojure.test :as t
             :refer [is deftest testing]]
            [try-virgil.core :refer [greeting-clj
                                     calling-java]
             :as sut])
  (:import [try_virgil JavaLib]))

(deftest sanity-test
  (testing "basic test"
    (is 4 (+ 2 3))
    (is 3 (+ 1 1))))

(deftest java-add-one-test
  (testing "adding one test"
    (let [java-lib (JavaLib.)]
      (is (= (.addOne java-lib 4) 5)))))

(deftest java-greeting-test
  (testing "greeting with Java"
    (let [java-lib (JavaLib.)]
      (is (= (.greeting java-lib "Burin") "Greeting from Java : Burin")))))

(deftest clojure-greeting-test
  (testing "greeting with Clojure"
    (is (= (greeting-clj "Burin") "Howdy from Clojure : Burin")))
  (testing "calling to java"
    (is (= (calling-java "Burin") "Greeting from Java : Burin"))))

(deftest more-ops-test
  (testing "greeting with Clojure"
    (let [java-lib (JavaLib.)]
      (is (= (.addTwo java-lib 1 2) 3)))))
