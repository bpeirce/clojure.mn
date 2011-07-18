(ns clojuremn.homepage
  (:use [hiccup.core :only [html h]]
        [hiccup.page-helpers :only [doctype include-css]]))

(defn index []
  (html
   (doctype :html5)
   [:head
    [:meta {:charset "utf-8"}]
    [:title "Clojure.mn - The Minnesota Clojure User Group"]
    (include-css "http://fonts.googleapis.com/css?family=Sigmar+One&v1")]
   [:body
    [:div {:id "header"}
     [:h1 {:class "container"} "Clojure.mn"]]
    [:div {:id "content"} "Main content"]]))
