package com.example;
import java.util.HashMap;
public class Main {
    private static final HashMap<Character, Integer> ALPHABET_MAP = new HashMap<>() {{
        put('A', 1);
        put('E', 5);
        put('I', 9);
        put('O', 15);
        put('U', 21);
        put('a', 1);
        put('e', 5);
        put('i', 9);
        put('o', 15);
        put('u', 21);
        put('а', 1);
        put('е', 6);
        put('ё', 7);
        put('и', 10);
        put('я', 33);
        put('э', 31);
        put('ю', 32);
        put('о', 16);
        put('ы', 29);
        put('y', 21);
        put('А', 1);
        put('Е', 6);
        put('Ё', 7);
        put('И', 10);
        put('Я', 33);
        put('Э', 31);
        put('Ю', 32);
        put('О', 16);
        put('Ы', 29);
        put('У', 21);



    }};

    public static String transformString(String input) {
        if (input == null || input.length() < 2) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            if (ALPHABET_MAP.containsKey(c)) {
                result.append(ALPHABET_MAP.get(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(transformString("АБОБУСABOBYU"));
        System.out.println(transformString("a"));
    }
}