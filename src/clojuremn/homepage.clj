(ns clojuremn.homepage
  (:use [hiccup.core :only [html h]]
        [hiccup.page-helpers :only [doctype include-css]]))

(defn index []
  (html
   (doctype :html5)
   [:head
    [:meta {:charset "utf-8"}]
    [:title "Clojure.mn - The Minnesota Clojure User Group"]
    (include-css "/stylesheets/base.css")]
   [:body
    [:div {:id "header"}
     [:h1 "Clojure.mn"]]
    [:div {:id "content"} "Main content"]]))
