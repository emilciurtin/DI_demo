package guru.springframework.demo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        System.out.println("hello");

        return "foo";
    }




}
