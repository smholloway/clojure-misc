(ns roman-numerals.core)

(defn roman-numeral
  "converts an input integer to a roman numeral string"
  ([]  (str "Romans knew nothing of 0!"))
  ([x] (cond (< x 0) (roman-numeral (- x))
             (> x 3000) "Numbers over 3000 are not supported."
             (= x 1) "I"
             (= x 2) "II"
             (= x 3) "III"
             (= x 4) "IV"
             (= x 5) "V"
             (= x 6) (str (roman-numeral 5) (roman-numeral (- x 5)))
             (= x 7) (str (roman-numeral 5) (roman-numeral (- x 5)))
             (= x 8) (str (roman-numeral 5) (roman-numeral (- x 5)))
             (= x 9) (str (roman-numeral (- 10 x)) (roman-numeral 10))
             (= x 10) "X"
             (= x 20) "XX"
             (= x 30) "XXX"
             (= x 50) "L"
             (= x 100) "C"
             (= x 1000) "M"
             (and (> x 8) (< x 10)) (str (roman-numeral (- 10 x)) (roman-numeral 10))
             (and (> x 10) (< x 14)) (str (roman-numeral 10) (roman-numeral (- 10 x)))
             (and (> x 13) (< x 39)) (str (roman-numeral 10) (roman-numeral (- 10 x)))
             (and (> x 38) (< x 40)) (str (roman-numeral 10) (roman-numeral (- 10 x)))
             (> x 1000) (str (roman-numeral 1000) (roman-numeral (- x 1000))))))

(defn -main [& args]
  (roman-numeral)
  (roman-numeral 1)
  (roman-numeral 2)
  (roman-numeral 5))


(defn notes []
  (str "1-3 are same 4-8 are same 9-13 is same 14-38 are same"))