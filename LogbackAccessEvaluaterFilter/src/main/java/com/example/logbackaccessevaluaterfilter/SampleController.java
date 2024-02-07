package com.example.logbackaccessevaluaterfilter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {

    @GetMapping("/filter")
    public String getFilter() {
        return "filter";
    }
}
