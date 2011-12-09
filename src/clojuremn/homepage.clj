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
     [:p "We meet the first Wednesday of the month at 7pm at "
      [:a {:href "http://refactr.com/contact/"} "Refactr"]
      ". Our next meeting will be on January 4th."]

     [:h2 "December 7, 2011"]
     [:p 
      "Brian Maddy and Ben Peirce gave a review of "
      [:a {:href "http://clojure-conj.org/"} "Clojure/conj 2011"]
      " and Dan Callahan talked about "
      [:a {:href "http://golang.org/"} "Go"]
      "'s approach to concurrency."]

     [:h2 "November 2, 2011"]
     [:p 
      "Brian Maddy talked about "
      [:a {:href "https://docs.google.com/a/brianmaddy.com/presentation/pub?id=1kXvRBksA7DtDpie3JOU7vY2VH23yLFpUVFc98BYLKnk&start=false&loop=false&delayms=3000#slide=id.p"} "Functional Relational Programming"]
      " and Ben Peirce talked about some tools for command line Clojure programs."]

    [:h2 "October 5, 2011"]
     [:p 
      "Greg Allen talked about Clojure's "
      [:a {:href "https://docs.google.com/present/edit?id=0AVDE9VMKvEjHZGdrZzJwcjJfMTEyYzZ6NmJwZHE&hl=en_US"} "java interop"]
      " and Ben Peirce talked about the relational algebra as its used in Clojure.sets."]

     [:h2 "September 7, 2011"]
     [:p 
      "Ben Peirce talked about "
      [:a {:href "http://bpeirce.me/clojure-sequence-implementations.html"}
       "Clojure sequence implementations"]
      " and Brian Maddy talked about "
      [:a {:href "https://docs.google.com/a/brianmaddy.com/present/view?id=dwqzvn5_14f7nm7ngk"} "ClojureScript"]
      "."]

     [:h2 "August 10, 2011"]
     [:p 
      "Ben Peirce walked through how he used "
      [:a {:href "https://github.com/mmcgrana/ring"} "Ring"]
      " and "
      [:a {:href "https://github.com/weavejester/hiccup"} "Hiccup"]
      " to make "
      [:a {:href "https://github.com/bpeirce/clojure.mn"} "this site"]
      ".  "
      "Brian Maddy showed how he used "
      [:a {:href "https://github.com/cgrand/enlive"} "Enlive"]
      " for one of his sites."
      ]
      
     [:h2 "July 13, 2011"]
     [:p "We discussed "
      [:a {:href "http://clojure-conj.org"} "Clojure/conj 2011"]
      ", compared the JVM to the CLR, and surveyed the NoSQL landscape."]
     ]

    [:p {:class "footer"}
     [:a {:href "https://github.com/bpeirce/clojure.mn"} "Fork this site!"] ]
    ]))
