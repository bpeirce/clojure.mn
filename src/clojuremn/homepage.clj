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
     [:h1 "Clo" [:span {:id "clojure-j"} "j"] "ure.mn"]
     [:p {:id "tagline"} "The Minnesota Clojure Users Group"]
     [:p {:class "announcement"}
      "Join our "
      [:a {:href "http://groups.google.com/group/clojuremn"} "mailing list"]
      ". Follow us on "
      [:a {:href "http://twitter.com/clojuremn"} "Twitter"]
      "."
      ]
     [:img {:id "logo" :src "/images/lambda.png"}]
     [:h2 "Next Meeting"]
     [:p "Our next meeting will be on Wednesday, September 7th at 7pm at "
      [:a {:href "http://refactr.com/contact/"} "Refactr"] "."]

     [:h2 "August 10, 2011"]
     [:p 
      [:a {:href "http://twitter.com/bpeirce"} "Ben"]
      " walked through how he used "
      [:a {:href "https://github.com/mmcgrana/ring"} "Ring"]
      " and "
      [:a {:href "https://github.com/weavejester/hiccup"} "Hiccup"]
      " to make "
      [:a {:href "https://github.com/bpeirce/clojure.mn"} "this site"]
      ".  "
      [:a {:href "http://twitter.com/bmaddy"} "Brian"]
      " showed how he used "
      [:a {:href "https://github.com/cgrand/enlive"} "Enlive"]
      " for one of his sites."
      ]
      
     [:h2 "July 13, 2011"]
     [:p "We discussed "
      [:a {:href "http://clojure-conj.org"} "Clojure/conj 2011"]
      ", compared the JVM to the CLR, and surveyed the NoSQL landscape."]
     ]
    ]))
