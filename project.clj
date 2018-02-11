(defproject try-virgil "0.1.0"
  :description "Example Clojure/Java interop project to test virgil"
  :url "http://github.com/agilecreativity/try-virgil"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clj"]
  :java-source-paths ["src/main/java"]
  :plugins [[lein-virgil "0.1.6"]
            [lein-auto "0.1.3"]]
  :auto {:default {:file-pattern #"\.(java|clj|cljs|cljx|cljc|edn)$"}}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :main try-virgil.core)
