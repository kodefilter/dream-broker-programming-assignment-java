package com.example.javatextanalyzer;

public class TextLength {
    private long withSpace;
    private long withoutSpace;

    public TextLength( long withSpace, long withoutSpace) {
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
