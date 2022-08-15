(ns bcd.app
  (:require ["react" :refer (createElement)]
            ["react-dom/client" :refer (createRoot)]))

(defn init []
  (let [container (.getElementById js/document "root")
        root (createRoot container)
        app (createElement "div" nil "Hello World!")]
    (.render root app)))
