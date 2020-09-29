package com.example.javatextanalyzer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyzeController {

    @PostMapping("/analyze")
    public Result result(@RequestBody Request request) {
        long result = request.getText().length();
        return new Result(result);
    }


}
