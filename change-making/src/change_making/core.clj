(ns change-making.core)

(defn change-aux [amount coins acc]
  "Returns the solutions that satisfy making change"
  (println (str "amount = " amount "\ncoins = " coins "\nacc = " acc "\n"))
  (cond
    (= amount 0) acc
    (or (< amount 0) (<= (count coins) 0)) '()
    :else (conj
      (change-aux amount (rest coins) acc)
      (change-aux (- amount (first coins)) coins (conj acc (first coins))))))

(defn make-change [amount coins]
  "amount is the amount to make change for; ex 6.
  coins is a list of the available coins; ex [1, 5, 10].
  solutions is a list of list of coins that add up to the amount; ex [(5, 1), (1, 1, 1, 1, 1, 1)]."
  (change-aux amount coins '()))
;  (map flatten (map #(remove nil? %) (change-aux amount coins '()))))  

(defn change [amount coins]
  "Counts the number of ways to make change as described in SICP
  http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-11.html#%_sec_1.2"
  (cond
    (= amount 0) 1
    (or (< amount 0) (<= (count coins) 0)) 0
    :else (+
      (change amount (rest coins))
      (change (- amount (first coins)) coins))))

(defn remove-nils [x]
  (println x)
  (if (list? x)
    (if (empty? x)
    (println (remove-nils (first x)) (remove-nils (rest x))))
    '()))

(defn test-list []
  '(((((((1 1 1 1 1 1) nil nil) nil nil) nil nil) nil nil) (5 1) nil) (nil nil) nil))

(defn -main
  "main"
  [& args]
  (change 100 '(1 5 10 25 50))
  (make-change 6 '(1 5 10)))