(defproject clojuremn "1.0.0-SNAPSHOT"
  :description "The web site for Clojure dot MN, the Minnesota Clojure group."
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [ring/ring-core "0.3.8"]
                 [ring/ring-jetty-adapter "0.3.8"]]
  :exclusions [org.mortbay.jetty/servlet-api])
