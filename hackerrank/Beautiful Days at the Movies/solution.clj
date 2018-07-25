
(defn reverse-number [number reversed]
    (if (= number 0)
        reversed
        (reverse-number (quot number 10)
                        (+ (rem number 10) (* reversed 10)))))

(defn rev [number]
    (reverse-number number 0))
; Complete the beautifulDays function below.
(defn beautifulDays [i j k]
    (count (filter #(= (mod (- (rev %) %) k) 0) (range i (+ j 1))))
    )


(def fptr (get (System/getenv) "OUTPUT_PATH"))

(def ijk (clojure.string/split (read-line) #" "))

(def i (Integer/parseInt (clojure.string/trim (nth ijk 0))))

(def j (Integer/parseInt (clojure.string/trim (nth ijk 1))))

(def k (Integer/parseInt (clojure.string/trim (nth ijk 2))))

(def result (beautifulDays i j k))

(spit fptr (str result "\n") :append true)
