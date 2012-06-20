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

     [:h2 "Next Meeting: Wednesday, August 1"]

     [:p "We meet the first Wednesday of the month at 7pm at "
      [:a {:href "http://refactr.com/contact/"} "Refactr"]
      "."
      [:p " We will not be holding a meeting in July meeting since the first Wednesday falls on Independence Day."]]

     [:h2 "June 6, 2012"]
     [:p 
      [:a {:href "https://github.com/nickbauman/"} "Nick Bauman"]
      " presented his ClojureScript work on the "
      [:a {:href "https://github.com/tmarble/nongrata"} "Nongrata"]
      " project.  We then held lightning talks with "
      [:a {:href "http://dancallahan.info/"} "Dan Callahan"]
      " discussing "
      [:a {:href "http://identity.mozilla.com/post/18038609895/introducing-mozilla-persona"} "Persona"]
      ", "
      [:a {:href "http://twitter.com/tmarble"} "Tom Marble"]
      " demoing his "
      [:a {:href "http://www.raspberrypi.org/"} "Raspberry Pi"]
      " serving the Nongrata website, and "
      [:a {:href "http://twitter.com/bmaddy"} "Brian Maddy"]
      " talking about "
      [:a {:href "https://github.com/clojure/core.logic"} "core.logic"]
      "."]

     [:h2 "May 2, 2012"]
     [:p
      [:a {:href "http://dancallahan.info/"} "Dan Callahan"]
      " talked about "
      [:a {:href "http://identity.mozilla.com/post/18038609895/introducing-mozilla-persona"} "Mozilla Persona"]
      " and the group hacked on a "
      [:a {:href "https://github.com/tmarble/nongrata"} "Noir implementation of that technology"]
      "."]

     [:h2 "April 4, 2012"]
     [:p
      [:a {:href "https://twitter.com/tednaleid"} "Ted Naleid"]
      " gave his "
      [:a {:href "http://tednaleid.github.com/showoff-clojurewest/#1"} "review of Clojure/West 2012"]
      " and "
      [:a {:href "http://bpeirce.me"} "Ben Peirce"]
      " talked about "
      [:a {:href "/presentations/latest-news/latest-news.html"} "some random Clojure news"]
      "."]

     [:h2 "March 7, 2012"]
     [:p
      [:a {:href "https://github.com/nickbauman/"} "Nick Bauman"]
      " talked about "
      [:a {:href "http://tinyurl.com/redis-s-expression"} "redit-s-expression"]
      " and "
      [:a {:href "http://twitter.com/bmaddy"} "Brian Maddy"]
      " talked about "
      [:a {:href "https://docs.google.com/file/d/0B593N-xk-VfFVTJtNndQZk1UbFNRc1MzXzFxR21pZw/edit"} "Pallet"]
      "."]

     [:h2 "February 1, 2012"]
     [:p
      [:a {:href "http://twitter.com/tmarble"} "Tom Marble"]
      " shared his experiences "
      [:a {:href "/presentations/noir-is-the-new-black.org"} "developing a web application using Noir"]
      " and "
      [:a {:href "http://twitter.com/akpanydre"} "Benjamin Ebby"]
      " talked about "
      [:a {:href "http://outcastgeek.com/blog/build-your-polyglot-app-with-jruby-and-rake.html"} "using JRuby and Rake with Clojure"]
      "."]

     [:h2 "December 7, 2011"]
     [:p 
      "Brian Maddy and Ben Peirce gave a review of "
      [:a {:href "http://clojure-conj.org/"} "Clojure/conj 2011"]
      " and "
      [:a {:href "http://dancallahan.info/"} "Dan Callahan"]
      " talked about "
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
