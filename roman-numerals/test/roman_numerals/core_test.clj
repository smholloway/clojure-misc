(ns roman-numerals.core-test
  (:use clojure.test
        roman-numerals.core))

(deftest roman-numeral-0
  (testing "roman-numeral 0"
    (is (= (roman-numeral) ""))))

(deftest roman-numeral-negative
  (testing "roman-numeral -1"
    (is (= (roman-numeral -1) "Negative numbers are not supported."))))

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

(deftest roman-numeral-14
  (testing "roman-numeral 14"
    (is (= (roman-numeral 14) "XIV"))))

(deftest roman-numeral-20
  (testing "roman-numeral 20"
    (is (= (roman-numeral 20) "XX"))))

(deftest roman-numeral-30
  (testing "roman-numeral 30"
    (is (= (roman-numeral 30) "XXX"))))

(deftest roman-numeral-36
  (testing "roman-numeral 36"
    (is (= (roman-numeral 36) "XXXVI"))))

(deftest roman-numeral-43
  (testing "roman-numeral 43"
    (is (= (roman-numeral 43) "XLIII"))))

(deftest roman-numeral-49
  (testing "roman-numeral 49"
    (is (= (roman-numeral 49) "XLIX"))))

(deftest roman-numeral-50
  (testing "roman-numeral 50"
    (is (= (roman-numeral 50) "L"))))

(deftest roman-numeral-99
  (testing "roman-numeral 99"
    (is (= (roman-numeral 99) "XCIX"))))

(deftest roman-numeral-100
  (testing "roman-numeral 100"
    (is (= (roman-numeral 100) "C"))))

(deftest roman-numeral-500
  (testing "roman-numeral 500"
    (is (= (roman-numeral 500) "D"))))

(deftest roman-numeral-999
  (testing "roman-numeral 999"
    (is (= (roman-numeral 999) "CMXCIX"))))

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
    (is (= (roman-numeral 3001) "MMMI"))))

(deftest roman-numeral-3999
  (testing "roman-numeral 3999"
    (is (= (roman-numeral 3999) "MMMCMXCIX"))))

(deftest roman-numeral-4000
  (testing "roman-numeral 4000"
    (is (= (roman-numeral 4000) "Numbers over 3999 are not supported."))))