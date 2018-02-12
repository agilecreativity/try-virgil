(ns try-virgil.core
  (:import [try_virgil.SampleLib]))

(defn hello-world
  ([]
   (str "Hello, World!"))
  ([who]
   (str "Hello, World! : " who)))

(defn clj-hello
  [who]
  (str "clj-hello : " who))

(defn greeting
  [who]
  (str "Hello " who))

(defn -main[& args]
  (try
    (hello-world)
    (println "Let's try to call java")

    (let [java-app (try_virgil.SimpleLib.)]
      (.greeting java-app "Max")
      (.addNumber java-app 3 4))
    (catch Exception e
      (.printStackTrace e)
      (println (str "Unexpected errros: " (.getMessage e))))))
