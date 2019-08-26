package com.heling.kata.fizzbuzz;

public class FizzBuzz {
    public String point(int num) {
        if (num % 3 == 0 & num % 5 != 0) {
            return "Fizz";
        } else if (num % 5 == 0 & num % 3 != 0) {
            return "Buzz";
        } else if (num % 3 == 0 & num % 5 == 0) {
            return "FizzBuzz";
        }
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i < 100; i++) {
            String point = fizzBuzz.point(i);
            System.out.println(point);
        }
    }
}
