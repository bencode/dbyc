(ns dbyc.app
  (:require [helix.core :refer [defnc $]]
            [helix.hooks :as hooks]
            [helix.dom :as d]
            ["react-dom/client" :as rdom]))

(defnc app []
  (d/div "Hello 123"))

(defn init []
  (let [container (js/document.getElementById "root")
        root (rdom/createRoot container)]
    (.render root ($ app))))
