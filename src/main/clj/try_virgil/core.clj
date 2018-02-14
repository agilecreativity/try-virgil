(ns try-virgil.core
  (:import [try_virgil.JavaLib]))

(defn greeting
  [who]
  (str "Greeting from Clojure : " who))

(defn -main[& args]
  (try
    ;; Calling Clojure function
    (greeting "Clojure")

    (let [java-lib (try_virgil.JavaLib.)]
      ;; Calling Java function
      (.greeting java-lib "Java"))
    (catch Exception e
      (.printStackTrace e)
      (println (str "Unexpected errros: " (.getMessage e))))))
