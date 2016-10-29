(ns clojagar.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [clojagar.core-test]
   [clojagar.common-test]))

(enable-console-print!)

(doo-tests 'clojagar.core-test
           'clojagar.common-test)
