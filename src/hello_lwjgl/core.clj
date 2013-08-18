(ns hello-lwjgl.core
  (:require [hello-lwjgl.alpha :as alpha]
            [hello-lwjgl.beta :as beta]
            [hello-lwjgl.gamma :as gamma]
            [hello-lwjgl.cube :as cube])
  (:gen-class))

;; ======================================================================
(defn -main
  "main entry point."
  [& args]
  (println "Hello, Lightweight Java Game Library!")
  (cond
   (= "alpha" (first args)) (alpha/main)
   (= "beta" (first args)) (beta/main)
   (= "gamma" (first args)) (gamma/main)
   (= "cube" (first args)) (cube/main)
   true (alpha/main))) ;; run alpha by default
