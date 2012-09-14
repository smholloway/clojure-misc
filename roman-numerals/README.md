# roman-numerals

A Clojure project to convert decimal integers to a roman numeral string.

## Usage

(roman-numeral ${NUMBER})

For example

(roman-numeral 1)
;=> "I"

(roman-numeral 14)
;=> "XIV"

## Working with Lein and Guard
Install Guard and initialize it with 

guard

or

bundle exec guard

The Guardfile watches for changes to Clojure files (.clj) then runs the test with the command

lein test

## License

Copyright © 2012 Seth Holloway

Distributed under the Eclipse Public License, the same as Clojure.