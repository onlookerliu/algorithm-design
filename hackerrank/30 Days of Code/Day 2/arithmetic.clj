

; Complete the solve function below.
(defn solve [meal_cost tip_percent tax_percent]
    (let [cost (* meal_cost (+ 1 (/ (+ tip_percent tax_percent) 100)))
          total_cost (Math/round cost)]
        (println (str "The total meal cost is " total_cost " dollars.")))
)

(def meal_cost (Double/parseDouble (clojure.string/trim (read-line))))

(def tip_percent (Integer/parseInt (clojure.string/trim (read-line))))

(def tax_percent (Integer/parseInt (clojure.string/trim (read-line))))

(solve meal_cost tip_percent tax_percent)