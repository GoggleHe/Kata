package com.heling.kata.fizzbuzz.test;

import com.heling.kata.fizzbuzz.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testSpeakNum() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Object[][] testCaseArr = new Object[][]{{1, "1"}, {2, "2"}, {4, "4"}, {7, "7"}, {8, "8"}, {11, "11"}};
        for (int i = 0; i < testCaseArr.length; i++) {
            String point = fizzBuzz.point((Integer) testCaseArr[i][0]);
            Assert.assertEquals(testCaseArr[i][0] + " is invalid !", testCaseArr[i][1], point);
        }
    }

    @Test
    public void testSpeakFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Object[][] testCaseArr = new Object[][]{{3, "Fizz"}, {6, "Fizz"}, {9, "Fizz"}, {12, "Fizz"}};
        for (int i = 0; i < testCaseArr.length; i++) {
            String point = fizzBuzz.point((Integer) testCaseArr[i][0]);
            Assert.assertEquals(testCaseArr[i][1], point);
        }
    }

    @Test
    public void testSpeakBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Object[][] testCaseArr = new Object[][]{{5, "Buzz"}, {10, "Buzz"}, {20, "Buzz"}, {25, "Buzz"}};
        for (int i = 0; i < testCaseArr.length; i++) {
            String point = fizzBuzz.point((Integer) testCaseArr[i][0]);
            Assert.assertEquals(testCaseArr[i][1], point);
        }
    }

    @Test
    public void testSpeakFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Object[][] testCaseArr = new Object[][]{{15, "FizzBuzz"}, {30, "FizzBuzz"}, {45, "FizzBuzz"}, {60, "FizzBuzz"}};
        for (int i = 0; i < testCaseArr.length; i++) {
            String point = fizzBuzz.point((Integer) testCaseArr[i][0]);
            Assert.assertEquals(testCaseArr[i][1], point);
        }
    }

    @Test
    public void testSpeakAll(){
        String expected = null;
        for(int i = 0; i < 100; i++){
            if (i % 3 == 0 & i % 5 != 0) {
                expected = "Fizz";
            }else if(i % 3 != 0 & i % 5 == 0){
                expected = "Buzz";
            } else if (i % 3 == 0 & i % 5 == 0) {
                expected = "FizzBuzz";
            } else {
                expected = String.valueOf(i);
            }
            FizzBuzz fizzBuzz = new FizzBuzz();
            String point = fizzBuzz.point(i);
            Assert.assertEquals(expected,point);

        }
    }

}
