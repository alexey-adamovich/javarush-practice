package by.it.aadamovich.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<List> list = new ArrayList<>();
        int n = scanner.nextInt();
        int d;
        for (int i = 0; i < n; i++) {
            d = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            list.add(line);
        }

        int q = scanner.nextInt();
        int x, y;

        for (int k = 0; k < q; k++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}


//Task: https://www.hackerrank.com/challenges/java-arraylist/problem