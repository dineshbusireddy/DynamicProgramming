package com.leetcode;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

@SpringBootTest
class SqrtXTest {

    @InjectMocks
    private SqrtX sqrtX;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(4, 2),
                Arguments.of(8, 2),
                Arguments.of(1, 1),
                Arguments.of(0, 0),
                Arguments.of(2147483647, 46340),
                Arguments.of(625, 25),
                Arguments.of(808201, 899)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    @Timeout(unit = TimeUnit.MILLISECONDS, value = 50)
    void testMySqrt(int input, int expected) {
        assertTimeoutPreemptively(Duration.ofMillis(50),
                () -> assertEquals(expected, sqrtX.mySqrt(input)));
    }

}