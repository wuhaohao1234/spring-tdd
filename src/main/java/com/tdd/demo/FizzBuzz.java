package com.tdd.demo;

public class FizzBuzz {
    public static String of(int i) {
        String result = "";
        if(isaBoolean(i, 3)) result += "Fizz";
        if(isaBoolean(i, 5)) result += "Buzz";
        return isResultEmpty(result) ? getValueOf(i) : result;
    }

    private static boolean isaBoolean(int i, int i2) {
        return i % i2 == 0;
    }

    @org.jetbrains.annotations.NotNull
    private static String getValueOf(int i) {
        return String.valueOf(i);
    }

    private static boolean isResultEmpty(String result) {
        return result.isEmpty();
    }
}
