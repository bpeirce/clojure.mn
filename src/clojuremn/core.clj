(ns clojuremn.core
  (:use ring.adapter.jetty
        ring.middleware.file
        ring.middleware.file-info
        clojuremn.homepage))

(defn handler [req]
  {:status   200
   :headers {"Content-Type" "text/html"}
   :body    (index-body)})

(def app
  (-> #'handler
      (wrap-file "resources/public")
      (wrap-file-info)))

(defn -main []
  (let [port (Integer/parseInt (get (System/getenv) "PORT" "8080"))]
    (run-jetty app {:port port})))
