package com.fullstack1.duoc.apirest.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ProductosController {
   
    @GetMapping("/productos")
    public String productos(){
        return "{Queso, Leche, Carne, Torta, Mouse gaer, Red Bull}";
    }

}
