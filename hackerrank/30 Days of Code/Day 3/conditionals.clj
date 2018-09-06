



(def N (Integer/parseInt (clojure.string/trim (read-line))))

(println (cond (odd? N) "Weird"
               (<= N 5) "Not Weird"
               (<= N 20) "Weird"
               :else "Not Weird"))