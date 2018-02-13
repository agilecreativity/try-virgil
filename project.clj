(defproject try-virgil "0.1.0"
  :description "Example Clojure/Java interop project to test virgil"
  :url "http://github.com/agilecreativity/try-virgil"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clj"]
  :test-paths ["test/clj" "test/java"]
  :java-source-paths ["src/main/java" "test/java"]
  :junit ["test/java"]
  :jvm-opts ["-XX:MaxPermSize=256m"] ;; these will be used as the opts for the junit process
  :junit-formatter "xml" ;; brief, plain, xml or summary. keyword or string
  :junit-results-dir "test-results"
  :plugins [[lein-virgil "0.1.6"]
            [lein-auto "0.1.4"]
	        [lein-junit "1.1.3"]]
  :hooks []
  :auto {:default {:file-pattern #"\.(java|clj|cljs|cljx|cljc|edn)$"}}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [junit/junit "4.12"]]
  :main try-virgil.core)
