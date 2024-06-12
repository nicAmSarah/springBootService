package com.geoSpring.geoSpring;


import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GetGeolocation {

    @GetMapping("/obtemLocal")
    public String localização(){
        return "Minha casa";
    }
    @GetMapping("/obtemData")
    public String data(){
        return LocalDateTime.now().toString();
    }     
    @GetMapping("/obtemNome")
    public String nome(){
        return "Sarah Nicacio";
    }
    @GetMapping("/obtemIdade")
    public String idade(){
        return "18";
    }
}