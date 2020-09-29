package com.example.javatextanalyzer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyzeController {

    @PostMapping("/analyze")
    public Result result(@RequestBody Request request) {
        return new Result(getTextLength(request.getText()));
    }

    public TextLength getTextLength(String text) {
        long withSpaces = text.length();
        long withoutSpaces = text.replaceAll(" ","").length();
        return new TextLength(withSpaces,withoutSpaces);
    }


}
