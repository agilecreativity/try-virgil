(ns try-virgil.core-test
  (:require [clojure.test :refer :all]
            [try-virgil.core :refer :all]))

;; https://github.com/clojure-cookbook/clojure-cookbook/blob/master/10_testing/10-01_unit-testing.asciidoc
;; https://github.com/clojure-cookbook/clojure-cookbook/blob/master/10_testing/10-01_unit-testing.asciidoc
;; http://clojure.github.io/clojure/clojure.test-api.html
;; https://clojuredocs.org/clojure.test/use-fixtures
;; https://clojuredocs.org/clojure.test
;; http://blog.jayfields.com/2010/08/clojuretest-introduction.html

;; Note: not working!
;; (deftest java-lib-test
;;   (let [java-lib (try_virgil.SampleLib.)]
;;     (testing "calling java functions"
;;       (is (= (.greeting java-lib "Max") "asss")))))
#_


(deftest hello-world-test
  (testing "Simple sanity test !"
    (println "FYI: inside test")
    #_
    (let [x (try_virgil.SampleLib.)]
      (println "FYI: xxx"))
    (is (= (hello-world) "Hello, World!"))
    (is (= (hello-world "Burin") "Hello, World! : Burin"))))

(deftest greeting-test
  (testing "greeting"
    (is (= (greeting "Burin") "Hello Burin"))))
