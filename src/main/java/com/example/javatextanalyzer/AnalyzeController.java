package com.example.javatextanalyzer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.TreeMap;

@RestController
public class AnalyzeController {

    @PostMapping("/analyze")
    public Result result(@RequestBody Request request) {
        return new Result(getTextLength(request.getText()), getWordCount(request.getText()), getCharacterCount(request.getText()));
    }

    public TextLength getTextLength(String text) {
        int withSpaces = text.length();
        int withoutSpaces = text.replaceAll(" ", "").length();
        return new TextLength(withSpaces, withoutSpaces);
    }

    public int getWordCount(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");

        return words.length;
    }

    public Object[] getCharacterCount(String text) {

        String cleanString = text.toLowerCase().replaceAll("[^a-z]", "");

        TreeMap<Character, Integer> charCountMap = new TreeMap<Character, Integer>();

        char[] strArray = cleanString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        return charCountMap.entrySet().toArray();
    }


}
