(ns roman-numerals.core-test
  (:use clojure.test
        roman-numerals.core))

(deftest roman-numeral-0
  (testing "roman-numeral 0"
    (is (= (roman-numeral) "Romans knew nothing of 0!"))))

(deftest roman-numeral-negative
  (testing "roman-numeral -1"
    (is (= (roman-numeral -1) "I"))))

(deftest roman-numeral-1
  (testing "roman-numeral 1"
    (is (= (roman-numeral 1) "I"))))

(deftest roman-numeral-2
  (testing "roman-numeral 2"
    (is (= (roman-numeral 2) "II"))))

(deftest roman-numeral-3
  (testing "roman-numeral 3"
    (is (= (roman-numeral 3) "III"))))

(deftest roman-numeral-4
  (testing "roman-numeral 4"
    (is (= (roman-numeral 4) "IV"))))

(deftest roman-numeral-5
  (testing "roman-numeral 5"
    (is (= (roman-numeral 5) "V"))))

(deftest roman-numeral-6
  (testing "roman-numeral 6"
    (is (= (roman-numeral 6) "VI"))))

(deftest roman-numeral-9
  (testing "roman-numeral 9"
    (is (= (roman-numeral 9) "IX"))))

(deftest roman-numeral-10
  (testing "roman-numeral 10"
    (is (= (roman-numeral 10) "X"))))

(deftest roman-numeral-20
  (testing "roman-numeral 20"
    (is (= (roman-numeral 20) "XX"))))

(deftest roman-numeral-30
  (testing "roman-numeral 30"
    (is (= (roman-numeral 30) "XXX"))))

(deftest roman-numeral-50
  (testing "roman-numeral 50"
    (is (= (roman-numeral 50) "L"))))

(deftest roman-numeral-100
  (testing "roman-numeral 100"
    (is (= (roman-numeral 100) "C"))))

(deftest roman-numeral-1000
  (testing "roman-numeral 1000"
    (is (= (roman-numeral 1000) "M"))))

(deftest roman-numeral-1001
  (testing "roman-numeral 1001"
    (is (= (roman-numeral 1001) "MI"))))

(deftest roman-numeral-1050
  (testing "roman-numeral 1050"
    (is (= (roman-numeral 1050) "ML"))))

(deftest roman-numeral-3000
  (testing "roman-numeral 3000"
    (is (= (roman-numeral 3000) "MMM"))))

(deftest roman-numeral-3001
  (testing "roman-numeral 3001"
    (is (= (roman-numeral 3001) "Numbers over 3000 are not supported."))))
