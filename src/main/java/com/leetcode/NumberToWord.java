package com.leetcode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.function.Predicate;

public class NumberToWord {

    public static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    public static final String[] tens = {
            "",
            "",
            "Twenty",
            "Thirty",
            "Forty",
            "Fifty",
            "Sixty",
            "Seventy",
            "Eighty",
            "Ninety"
    };

    private static final String EMPTY = "";
    private static final String SPACE = " ";
    private static final String AND = " and ";
    private static final int ZERO = 0;
    //private static final String ZERO_STRING = "Zero";
    private static final int TWENTY = 20;
    private static final int HUNDRED = 100;
    private static final String HUNDRED_STRING = "Hundred";
    private static final int TEN = 10;
    private static final int THOUSAND = 1000;
    private static final int LAKH = 100000;
    private static final int CRORE = 10000000;
    private static final String LAKH_STRING = "Lakh";
    private static final String THOUSAND_STRING = "Thousand";
    //private static final int MAX_INPUT = 999999999;
    private static final String CRORE_STRING = "Crore";
    //private static final String INVALID = "Invalid Input";

    private static String getUnit(Predicate<Integer> value, int input, String unit) {
        String result;
        if (unit == null) {
            result = value.test(input) ? EMPTY : SPACE;
        } else {
            result = SPACE + unit;
            if (HUNDRED_STRING.equals(unit)) {
                result += value.test(input) ? EMPTY : AND;
            } else {
                result += value.test(input) ? EMPTY : SPACE;
            }
        }
        return result;
    }

    public String convert(final int input) {
        if (input < ZERO) {
            return "Minus " + convert(-input);
        }

        if (input < TWENTY) {
            return units[input];
        }

        if (input < HUNDRED) {
            return tens[input / TEN] +
                    getUnit((in) -> in % TEN == ZERO, input, null) +
                    units[input % TEN];
        }

        if (input < THOUSAND) {
            return units[input / HUNDRED] +
                    getUnit(in -> in % HUNDRED == ZERO, input, HUNDRED_STRING) +
                    convert(input % HUNDRED);
        }

        if (input < LAKH) {
            return convert(input / THOUSAND) +
                    getUnit(in -> in % THOUSAND == ZERO, input, THOUSAND_STRING) +
                    convert(input % THOUSAND);
        }

        if (input < CRORE) {
            return convert(input / LAKH) +
                    getUnit(in -> in % LAKH == ZERO, input, LAKH_STRING) +
                    convert(input % LAKH);
        }

        return convert(input / CRORE) +
                getUnit((in) -> in % CRORE == ZERO, input, CRORE_STRING) +
                convert(input % CRORE);
    }

    static HashMap<Integer, String> words = new HashMap<>();
    static {
        words.put(0, "");
        words.put(1, "One");
        words.put(2, "Two");
        words.put(3, "Three");
        words.put(4, "Four");
        words.put(5, "Five");
        words.put(6, "Six");
        words.put(7, "Seven");
        words.put(8, "Eight");
        words.put(9, "Nine");
        words.put(10, "Ten");
        words.put(11, "Eleven");
        words.put(12, "Twelve");
        words.put(13, "Thirteen");
        words.put(14, "Fourteen");
        words.put(15, "Fifteen");
        words.put(16, "Sixteen");
        words.put(17, "Seventeen");
        words.put(18, "Eighteen");
        words.put(19, "Nineteen");
        words.put(20, "Twenty");
        words.put(30, "Thirty");
        words.put(40, "Forty");
        words.put(50, "Fifty");
        words.put(60, "Sixty");
        words.put(70, "Seventy");
        words.put(80, "Eighty");
        words.put(90, "Ninety");
    }

    String[] digits = {"", "Hundred", "Thousand", "Lakh", "Crore"};



    public String convertToIndianCurrency(BigDecimal num) {
        long no = num.longValue();
        int decimal = (int) (num.remainder(BigDecimal.ONE).doubleValue() * 100);
        int digits_length = String.valueOf(no).length();
        int i = 0;
        ArrayList<String> str = new ArrayList<>();

        long number;
        while (i < digits_length) {
            int divider = (i == 2) ? 10 : 100;
            number = no % divider;
            no = no / divider;
            i += divider == 10 ? 1 : 2;
            if (number > 0) {
                int counter = str.size();
                String plural = (counter > 0 && number > 9) ? "s" : "";
                String tmp = (number < 21) ? words.get((int) number) + " " +
                        digits[counter] + plural : words.get((int) Math.floor(number / 10) * 10) + " " +
                        words.get((int) (number % 10)) + " " + digits[counter] + plural;
                str.add(tmp);
            } else {
                str.add("");
            }
        }

        Collections.reverse(str);
        String Rupees = String.join(" ", str).trim();

        String paise = (decimal) > 0 ? " And Paise " +
                words.get((decimal - decimal % 10)) + " " +
                words.get(decimal % 10) : "";
        return "Rupees " + Rupees + paise + " Only";
    }

}
