(ns clojuremn.core
  (:use ring.adapter.jetty
        ring.middleware.file
        clojuremn.homepage))

(defn handler [req]
  {:status   200
   :headers {"Content-Type" "text/html"}
   :body    (index)})

(defn -main []
  (let [port (Integer/parseInt (get (System/getenv) "PORT" "8080"))]
    (run-jetty (wrap-file handler "resources/public") {:port port})))
