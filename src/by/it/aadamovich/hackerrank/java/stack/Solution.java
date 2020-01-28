package by.it.aadamovich.hackerrank.java.stack;

import java.util.*;

public class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');
        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                Character c = input.charAt(i);
                if (!pairs.containsKey(c)) {
                    stack.push(c);
                } else if (stack.empty() || stack.pop() != pairs.get(c)) {
                    stack.push(c);
                    break;
                }
            }
            System.out.println(stack.isEmpty());
        }
    }
}

//Task: https://www.hackerrank.com/challenges/java-stack/problem