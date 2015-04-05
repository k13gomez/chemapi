(defproject chemapi "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-time "0.9.0"]
                 [jumblerg/ring.middleware.cors "1.0.1"]
                 [metosin/compojure-api "0.19.0"]
                 [metosin/ring-http-response "0.6.1"]
                 [metosin/ring-swagger-ui "2.1.8-M1"]]
  :ring {:handler chemapi.handler/app}
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]]
                   :plugins [[lein-ring "0.9.2"]]}})
