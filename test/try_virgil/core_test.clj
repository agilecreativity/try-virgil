(ns try-virgil.core-test
  (:require [clojure.test :refer :all]
            [try-virgil.core :refer :all]))

(deftest hello-world-test
  (testing "Simple sanity test"
    (is (= (hello-world) "Hello, World!"))
    (is (= (hello-world "Burin") "Hello, World! : Burin"))))

(deftest greeting-test
  (testing "greeting"
    (is (= (greeting "Burin") "Hello Burin"))))
