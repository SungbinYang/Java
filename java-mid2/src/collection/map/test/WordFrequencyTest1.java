package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] textArr = text.split(" ");
        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : textArr) {
            wordMap.put(word, wordMap.containsKey(word) ? wordMap.get(word) + 1 : 1);
        }

        System.out.println(wordMap);
    }
}
