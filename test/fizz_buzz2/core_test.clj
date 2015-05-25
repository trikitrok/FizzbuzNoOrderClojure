(ns fizz-buzz2.core-test
  (:use midje.sweet)
  (:use [fizz-buzz2.core]))

(facts
  "about fizz-buzz"

  (fact
    "when default rule applies the same number is said"
    (say 1) => 1
    (say 2) => 2)

  (fact
    "when number is multiple of 3 Fizz is said"

    (say 3) => "Fizz"
    (say 6) => "Fizz")

  (fact
    "when number is multiple of 5 Buzz is said"
    (say 5) => "Buzz"
    (say 10) => "Buzz")

  (fact
    "when number is multiple of 3 and 5 FizzBuzz is said"
    (say 15) => "FizzBuzz"))