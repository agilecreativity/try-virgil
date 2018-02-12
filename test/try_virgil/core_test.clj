(ns try-virgil.core-test
  (:import [try_virgil.SampleLib])
  (:require [clojure.test :refer :all]
            [try-virgil.core :refer :all]))

;; https://github.com/clojure-cookbook/clojure-cookbook/blob/master/10_testing/10-01_unit-testing.asciidoc
;; https://github.com/clojure-cookbook/clojure-cookbook/blob/master/10_testing/10-01_unit-testing.asciidoc
;; http://clojure.github.io/clojure/clojure.test-api.html
;; https://clojuredocs.org/clojure.test/use-fixtures
;; https://clojuredocs.org/clojure.test
;; http://blog.jayfields.com/2010/08/clojuretest-introduction.html

;; Finally, the working edition
(deftest java-lib-test
    (testing "java-lib-test"
        (println "About to call the Java code!")
        (let [java-lib (try_virgil.SimpleLib.)]
            (.greeting java-lib "Max"))
        (is (= 1 1))))

(deftest hello-world-test
  (testing "Simple sanity test !"
    (is (= (hello-world) "Hello, World!"))
    (is (= (hello-world "Burin") "Hello, World! : Burin"))))

(deftest greeting-test
  (testing "greeting"
    (is (= (greeting "Burin") "Hello Burin"))))
