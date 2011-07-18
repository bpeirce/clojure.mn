(ns clojuremn.core
  (:use ring.util.response
        ring.adapter.jetty
        clojuremn.homepage))

(defn app [req]
  (response (index)))

(defn -main []
  (let [port (Integer/parseInt (get (System/getenv) "PORT" "8080"))]
    (run-jetty app {:port port})))
