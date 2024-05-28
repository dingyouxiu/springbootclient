package dyx.learn.springbootclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWordController {

    @GetMapping("/word")
    public String helloWord() {
        return "hello world";
    }

}
