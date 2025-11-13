package com.UH.OtherLevel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/venues")
public class VanueController {

    @PostMapping
    public ResponseEntity<?> crearLugares (){
        return null;
    }

    @GetMapping
    public ResponseEntity<?> obtenerTodosLosLugares (){
        return null;
    }

    @GetMapping("/events/{id}")
    public ResponseEntity<?> obtenerPorId (){
        return null;
    }

    @PutMapping("/events/{id}")
    public ResponseEntity<?> editarLugar (){
        return null;
    }
    @DeleteMapping("/events/{id}")
    public ResponseEntity<?> eliminarLugar (){
        return null;
    }
}
