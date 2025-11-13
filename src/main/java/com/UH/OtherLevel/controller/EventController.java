package com.UH.OtherLevel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/events")
public class EventController {

    @PostMapping
    public ResponseEntity<?> crearEvento (){
        return null;
    }

    @GetMapping
    public ResponseEntity<?> obtenerTodosLosEventos (){
        return null;
    }

    @GetMapping("/events/{id}")
    public ResponseEntity<?> obtenerPorId (){
        return null;
    }

    @PutMapping("/events/{id}")
    public ResponseEntity<?> editarEvento (){
        return null;
    }
    @DeleteMapping("/events/{id}")
    public ResponseEntity<?> eliminarEvento (){
        return null;
    }
}
