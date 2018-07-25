

; Complete the angryProfessor function below.
(defn angryProfessor [k a]
    (let [on-time (count (filter #(<= % 0) a))]
        (if (>= on-time k) 'NO 'YES))
)

(def fptr (get (System/getenv) "OUTPUT_PATH"))

(def t (Integer/parseInt (clojure.string/trim (read-line))))

(doseq [t-itr (range t)]
    (def nk (clojure.string/split (read-line) #" "))

    (def n (Integer/parseInt (clojure.string/trim (nth nk 0))))

    (def k (Integer/parseInt (clojure.string/trim (nth nk 1))))

    (def a (vec (map #(Integer/parseInt %) (clojure.string/split (read-line) #" "))))

    (def result (angryProfessor k a))

    (spit fptr (str result "\n") :append true)
)
