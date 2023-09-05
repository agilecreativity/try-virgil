(ns try-virgil.core
  (:import [try_virgil JavaLib]))

(defn greeting-clj
  [who]
  (str "Howdy from Clojure : " who))

(defn calling-java
  [msg]
  (let [java-lib (JavaLib.)]
    (.greeting java-lib msg)))

(defn -main [& _args]
  (try
    ;; Calling Clojure function
    (greeting-clj "Clojure")
    (let [mylib (JavaLib.)]
      ;; Calling Java function
      (.greeting mylib "Java"))
    (catch Exception e
      (.printStackTrace e)
      (println (str "Unexpected errros: " (.getMessage e))))))
