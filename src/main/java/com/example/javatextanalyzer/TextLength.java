package com.example.javatextanalyzer;

public class TextLength {
    private int withSpace;
    private int withoutSpace;

    public TextLength(int withSpace, int withoutSpace) {
        this.withSpace = withSpace;
        this.withoutSpace = withoutSpace;
    }

    public long getWithSpace() {
        return withSpace;
    }

    public long getWithoutSpace() {
        return withoutSpace;
    }
}
