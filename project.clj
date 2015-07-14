(defproject hunspell-stemmer "0.2.0"

  ; GENERAL OPTIONS

  :description "Hunspell stemmer functionality filtered out of Lucene 5.2.1."
  :url "http://github.com/lopusz/hunspell-stemmer"
  :license {:name " Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  ;; Options used by Java
  ;;; run with assertions enabled

  :java-source-paths ["src"]
  :omit-source true
  :aot :all  
  
  ; DEPENDENCIES

  :dependencies [
    [org.apache.lucene/lucene-core "5.2.1"]
    [org.apache.lucene/lucene-analyzers-common "5.2.1"]
   ])
