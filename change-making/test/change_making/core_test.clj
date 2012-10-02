(ns change-making.core-test
  (:use clojure.test
        change-making.core))

(deftest negative-has-no-solutions-test
  (testing "Negative inputs should have no solution"
    (is (= (make-change -1 (set [1]) (set [])) (set [])))))

(deftest one-has-one-solution
  (testing "Input of one with only a one cent coin should yield one solution"
    (is (= (make-change 1 (set [1]) (set [])) 1))))

(deftest one-simple-solution
  (testing "Input of five with only a five cent coin should yield one solution"
    (is (= (make-change 5 (set [5]) (set [])) 5))))

(deftest sicp-example
  (testing "Making change for $1.00 with American currency should yield 292 options"
    (is (= 292 (change 100 '(1 5 10 25 50))))))

(deftest zero-money-empty-coins
  (testing "should return 1 when money requested is zero and coins is empty"
    (is (= (change 0 '()) 1))))

(deftest zero-money
  (testing "should return 1 when money requested is zero and coins is NOT empty"
    (is (= (change 0 '(1,2)) 1))))

(deftest positive-money
  (testing "should return 0 when money requested is positive and coins is empty"
    (is (= (change 10 '()) 0))))

(deftest negative-money
  (testing "should return 0 when money requested is negative and coins is empty"
    (is (= (change -10 '()) 0))))

(deftest example
  (testing "example from instructions"
    (is (= (change 4 '(1,2)) 3))))

(deftest softed-chf
  (testing "sorted CHF"
    (is (= (change 300 '(5,10,20,50,100,200,500)) 1022))))

(deftest no-pennies
  (testing "no pennies"
    (is (= (change 301 '(5,10,20,50,100,200,500)) 0))))

(deftest unsorted-chf
  (testing "unsorted CHF"
    (is (= (change 300 '(500,5,50,100,20,200,10)) 1022))))