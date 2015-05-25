(ns fizz-buzz2.core)

(defn- divisible-by? [divisor number]
  (zero? (mod number divisor)))

(defn- divisible-only-by-3? [number]
  (and (divisible-by? 3 number)
       (not (divisible-by? 5 number))))

(defn- divisible-only-by-5? [number]
  (and (divisible-by? 5 number)
       (not (divisible-by? 3 number))))

(defn- divisible-by-3-and-5? [number]
  (and (divisible-by? 3 number)
       (divisible-by? 5 number)))

(defn- not-divisible-by-3-nor-5? [number]
  (not (or (divisible-by? 3 number)
           (divisible-by? 5 number))))

(defn say [number]
  (cond
    (not-divisible-by-3-nor-5? number) number
    (divisible-only-by-3? number) "Fizz"
    (divisible-by-3-and-5? number) "FizzBuzz"
    (divisible-only-by-5? number) "Buzz"))