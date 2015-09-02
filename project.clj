(defproject wordbots "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/data.generators "0.1.2"]
                 [com.joshuadavey/vecset "0.2.0"]
                 [compojure "1.4.0"]
                 [instaparse "1.4.1" :exclusions [org.clojure/clojure]]
                 [image-resizer  "0.1.7"]
                 [clj-http "2.0.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [ring/ring-json "0.4.0"]]
  :plugins [[lein-ring "0.9.6" :exclusions [org.clojure/clojure]]]
  :ring {:init wordbots.handler/init
         :handler wordbots.handler/app}
  :profiles {:uberjar {:aot :all}}
)
