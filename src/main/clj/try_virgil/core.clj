(ns try_virgil.core
  (:gen-class)
  (:import [try_virgil.SampleLib]))

(defn hello-world
  []
  (str "FYI: Hello, world!"))

(defn -main[& args]
  (try
    (println "Hello, world!")
    (hello-world)

    (println "Let's try to call java")

    (let [java-app (try_virgil.SimpleLib.)]
      (.greeting java-app "Burin")
      (println "------------")
      (.addNumber java-app 3 4))
    (catch Exception e
      (.printStackTrace e)
      (println (str "Unexpected errros: " (.getMessage e))))))
