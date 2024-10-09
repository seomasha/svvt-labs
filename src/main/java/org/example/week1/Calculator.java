package org.example.week1;

import java.util.Arrays;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    public int factorial(int a) {
        if(a == 0 || a == 1) {
            return 1;
        }

        return a * factorial(a-1);
    }

    public String[] returnWordsFromSentence(String sentence) {
        if(sentence == null) {
            return null;
        }

        return sentence.split(" ");
    }

    public int[] sort(int[] array) {
        if(array.length == 0) {
            return new int[0];
        }

        Arrays.sort(array);

        return array;
    }
}
