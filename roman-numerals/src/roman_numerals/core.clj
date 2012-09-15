(ns roman-numerals.core)

(defn roman-numeral
  "converts an input integer to a roman numeral string"
  ([]  (str ""))
  ([x] (cond (< x 0) "Negative numbers are not supported."
             (> x 3999) "Numbers over 3999 are not supported."
             (> x 999) (str "M"  (roman-numeral (- x 1000)))
             (> x 899) (str "CM" (roman-numeral (- x 900)))
             (> x 499) (str "D"  (roman-numeral (- x 500)))
             (> x 399) (str "CD" (roman-numeral (- x 400)))
             (> x 99)  (str "C"  (roman-numeral (- x 100)))
             (> x 89)  (str "XC" (roman-numeral (- x 90)))
             (> x 49)  (str "L"  (roman-numeral (- x 50)))
             (> x 39)  (str "XL" (roman-numeral (- x 40)))
             (> x 9)   (str "X"  (roman-numeral (- x 10)))
             (> x 8)   (str "IX" (roman-numeral (- x 9)))
             (> x 4)   (str "V"  (roman-numeral (- x 5)))
             (> x 3)   (str "IV" (roman-numeral (- x 4)))
             (> x 0)   (str "I"  (roman-numeral (- x 1)))
             (= x 0)   (str ""))))

(defn -main [& args]
  (roman-numeral)
  (roman-numeral 1))