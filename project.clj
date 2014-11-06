(defproject markov-texts "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/data.generators "0.1.2"] ]
  :plugins [[lein-ring "0.8.13" :exclusions [org.clojure/clojure]]]
  :ring {:init markov-texts.handler/init
         :handler markov-texts.handler/app}
  :profiles {:uberjar {:aot :all}}
)
