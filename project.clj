(defproject overtone "0.1"
  :description "An audio/musical experiment."
  :repositories [["java.net" "http://download.java.net/maven/2/"]]
  :dependencies [[org.clojure/clojure "1.1.0-alpha-SNAPSHOT"]
                 [org.clojure/clojure-contrib "1.0-SNAPSHOT"]
		 [org.clojars.fyuryu/rosado.processing "1.0.7"]
                 [net.java.dev.scenegraph/scenegraph "svn"]
		 [com.raelity/jvi "1.2.6"]
                 [jfree/jfreechart "1.0.12"]
                ]
  :dev-dependencies [[swank-clojure "1.1.0-SNAPSHOT"]
                     [lein-clojars "0.5.0-SNAPSHOT"]]
  :main overtone.gui.main)
