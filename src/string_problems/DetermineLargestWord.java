package string_problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement a solution to find the length of the longest word in the given sentence below
         Your solution should return a map containing the length of the word as the key & the word itself as the value
            "10: biological"
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

            String longest = Arrays.stream(s.split(" "))
                    .max(Comparator.comparingInt(String::length))
                    .orElse(null);
            System.out.println(longest);
        }



    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        // Implement here

        return map;
    }
}
