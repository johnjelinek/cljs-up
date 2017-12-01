(ns cljs-up.core)

(let [http (js/require "http")
      process (js/require "process")
      cb (fn [_ res] (.end res "Hello World from CLJS\n"))
      port (.. process -env -PORT)]
  (-> http
    (.createServer cb)
    (.listen port)))
