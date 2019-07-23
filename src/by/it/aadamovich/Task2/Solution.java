package by.it.aadamovich.Task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        int[] counts = new int[33];

        // Ввод строк

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine()
                    .toLowerCase()
                    .replaceAll("[^а-яё]","");
            for (int j = 0; j < s.length(); j++) {
                int index = alphabet.indexOf(s.charAt(j));
                counts[index]++;
            }
        }

        // напишите тут ваш код
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + counts[i]);
        }
    }
}