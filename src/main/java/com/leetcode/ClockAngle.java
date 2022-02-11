package com.leetcode;

/**
 *
 */
public class ClockAngle {

    public double clockAngle(int hour, int minutes) {
        double result = 0;
        if (hour < 0 || minutes < 0 || minutes > 60 || hour > 24) {
            result = -1;
        }else if (hour > 0 || minutes > 0){
            if (hour > 12) {
                hour = hour - 12;
            } else if (hour == 0) {
                hour = 12;
            }

            if (minutes == 60) {
                minutes = 0;
                hour += 1;
            }
            double minutePosition =  minutes * 6;
            double hourPosition = (hour*60 + minutes)*0.5;
            double angle = Math.abs(hourPosition - minutePosition);
            result = Math.min(360-angle, angle);
        }

        return result;
    }
}
