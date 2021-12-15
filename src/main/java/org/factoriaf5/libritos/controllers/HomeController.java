package org.factoriaf5.libritos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.Book;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }


}


