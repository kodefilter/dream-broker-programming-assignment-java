package com.example.javatextanalyzer;

import java.util.HashMap;
import java.util.TreeMap;

public class Result {
    private TextLength textLength;
    private int wordCount;
    private Object[] characterCount;

    public Result(TextLength textLength, int wordCount, Object[] characterCount) {
        this.textLength = textLength;
        this.wordCount = wordCount;
        this.characterCount = characterCount;
    }

    public Object[] getCharacterCount() {
        return characterCount;
    }

    public TextLength getTextLength() {
        return textLength;
    }

    public long getWordCount() {
        return wordCount;
    }
}
