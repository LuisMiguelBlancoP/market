package com.cursospring.market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/saludar")
public class HolaMundoController {

    @GetMapping(path = "/hola")
    public String saludar(){
        return "Hola Mundo sin emoji :fire: ";
    }
}
