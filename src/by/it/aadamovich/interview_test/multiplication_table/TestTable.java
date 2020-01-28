package by.it.aadamovich.interview_test.multiplication_table;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestTable {

    public static void main(String[] args) {
        showMultipleTable(4);
        showMultipleTableStream(3);

    }

    static void showMultipleTable(int columnTotal) {

        for (int i = 1; i < 10; i += columnTotal) {
            for (int j = 1; j < 10; j++) {
                for (int k = i; k < i + columnTotal && k < 10; k++) {
                    System.out.printf("%2d x %2d = %2d ", j, k, k * j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    static void showMultipleTableStream(int columnInLine) {

        final Integer[] multipliers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int linesNumber = (multipliers.length % columnInLine > 0)
                ? multipliers.length / columnInLine + 1 : multipliers.length / columnInLine;

        for (int i = 0; i < linesNumber; i++) {
            final List<Integer> currentLineMultipliers = Arrays.stream(multipliers)
                    .skip(i * columnInLine)
                    .limit(columnInLine)
                    .collect(Collectors.toList());
            final Stream<Integer> streamAllMultipliers = Arrays.stream(multipliers);

            streamAllMultipliers.forEach(multiplier -> {
                for (Integer groupMultiplier : currentLineMultipliers) {
                    System.out.printf("%2d x %2d = %2d ", multiplier, groupMultiplier, multiplier * groupMultiplier);
                }
                System.out.println();
            });
            System.out.println();
        }
    }
}
