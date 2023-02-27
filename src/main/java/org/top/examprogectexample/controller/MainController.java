package org.top.examprogectexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/ping")
    public String toString(){
        return "pong";
    }
}
