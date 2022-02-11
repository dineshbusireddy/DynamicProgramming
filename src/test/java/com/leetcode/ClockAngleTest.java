package com.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClockAngleTest {

    @InjectMocks
    private ClockAngle clockAngle;

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(9, 60, 60),
                Arguments.of(3, 30, 75),
                Arguments.of(12, 0, 0),
                Arguments.of(3, 0, 90),
                Arguments.of(15, 0, 90),
                Arguments.of(2, 60, 90),
                Arguments.of(24, 0, 0),
                Arguments.of(25, 0, -1),
                Arguments.of(22, 61, -1),
                Arguments.of(9, 0, 90),
                Arguments.of(3, 15, 7.5),
                Arguments.of(12, 30, 165)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testClockAngle(int hour, int minutes, double expected) {
        assertEquals(expected, clockAngle.clockAngle(hour, minutes));
    }
}