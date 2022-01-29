package com.dynamicprogramming.add_two_numbers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddTwoNumbersTest {

    @ParameterizedTest
    @MethodSource("testAddTwoNumbers")
    void executeTest() {
    }
}