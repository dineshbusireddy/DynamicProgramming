package com.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddBinaryTest {

    @InjectMocks
    private AddBinary addBinary;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("11", "1", "100"),
                Arguments.of("11", "11", "110"),
                Arguments.of("1010", "1011", "10101")

        );
    }

    @Test
    void addBinary() {
    }
}