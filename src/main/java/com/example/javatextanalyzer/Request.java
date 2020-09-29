package com.example.javatextanalyzer;

public class Request {
    private String text;

    //This is needed for deserializing in request body
    public Request() {
    }

    public Request(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
