package by.it.aadamovich.hackerrank.java.bigdecimal;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, 0, n, (a, b) -> new BigDecimal(b).compareTo(new BigDecimal(a)));
        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

//Task: https://www.hackerrank.com/challenges/java-bigdecimal/problem