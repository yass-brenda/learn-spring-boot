package com.example.demo.paquetito;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
public class NombreInutil {
    @GetMapping("api")
    public String getHome() {
        /**
         * {"name": "algun valor"}
         * "un texto"
         * 5
         */
        return "\"ESto no es una api\"";
    }
}
