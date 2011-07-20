(ns clojuremn.homepage
  (:use [hiccup.core :only [html h]]
        [hiccup.page-helpers :only [doctype include-css]]))

(defn index-body []
  (html
   (doctype :html5)
   [:head
    [:meta {:charset "utf-8"}]
    [:title "Clojure.mn - The Minnesota Clojure User Group"]
    (include-css "/stylesheets/base.css")]
   [:body
    [:div {:id "content"}
     [:h1 "Clo"
      [:span {:id "clojure-j"} "j"]
      "ure.mn"]
     [:p {:id "headline"} "The Minnesota Clojure Users Group"]
     [:p "this is some content"]]
    ]))
