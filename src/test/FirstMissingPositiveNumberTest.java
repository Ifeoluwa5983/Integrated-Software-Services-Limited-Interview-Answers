package test;

import main.FirstMissingPositiveNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class FirstMissingPositiveNumberTest {
    FirstMissingPositiveNumber firstMissingPositiveNumber;

    @BeforeEach
    void setUp() {
        firstMissingPositiveNumber = new FirstMissingPositiveNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getFirstMissingPositiveNumber() {
        Integer[] myArray = {1,5,7,4,1,2};

        System.out.println(firstMissingPositiveNumber.getFirstMissingPositiveNumber(myArray));
    }

    @Test
    void getFirstMissingPositiveNumberWithNegativeValues() {
        Integer[] myArray = {-1, -5};

        System.out.println(firstMissingPositiveNumber.getFirstMissingPositiveNumber(myArray));
    }

    @Test
    void getFirstMissingPositiveNumberWithTheFirstThreePostiveNumbers() {
        Integer[] myArray = {1,2, 3};

        System.out.println(firstMissingPositiveNumber.getFirstMissingPositiveNumber(myArray));
    }

    @Test
    void getFirstMissingPositiveNumberWithEmptyValues() {
        Integer[] myArray = {};

        System.out.println(firstMissingPositiveNumber.getFirstMissingPositiveNumber(myArray));
    }

}

