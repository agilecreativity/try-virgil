(defproject try-virgil "0.1.0-SNAPSHOT"
  :description "Example Clojure/Java interop project with the help of lein-virgil."
  :url "http://github.com/agilecreativity/try-virgil"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clj"]
  :java-source-paths ["src/main/java"]
  :plugins [[lein-virgil "0.1.6"]]
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main try_virgil.core)
