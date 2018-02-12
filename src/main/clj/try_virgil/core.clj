(ns try-virgil.core
  (:import [try_virgil.SampleLib]))

(defn greeting
  [who]
  (str "Hello there, " who))

(defn -main[& args]
  (try
    (greeting "Burin")
    (println "Let's try to call java")

    (let [java-app (try_virgil.SimpleLib.)]
      (.greeting java-app "Max")
      (.addNumber java-app 3 4))
    (catch Exception e
      (.printStackTrace e)
      (println (str "Unexpected errros: " (.getMessage e))))))
