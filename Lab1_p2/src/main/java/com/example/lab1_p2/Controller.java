package com.example.lab1_p2;

import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String processRequest() {
        return "files/index.html";
    }
}

