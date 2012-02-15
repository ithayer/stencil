(defproject ithayer/stencil "0.2.0"
  :description "Mustache in Clojure - modified to include c* context in lambdas"
  :dependencies [[clojure "1.3.0"]
                 [slingshot "0.8.0"]]
  :dev-dependencies [[ritz "0.2.0"]
                     [org.clojure/data.json "0.1.1"]]
  :extra-files-to-clean ["test/spec"])