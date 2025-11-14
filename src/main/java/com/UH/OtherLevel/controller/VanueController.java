package com.UH.OtherLevel.controller;

import com.UH.OtherLevel.dto.VenueDTO;
import com.UH.OtherLevel.mapper.VanueMapper;
import com.UH.OtherLevel.model.Venue;
import com.UH.OtherLevel.service.EventService;
import com.UH.OtherLevel.service.VenueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/venues")
@RequiredArgsConstructor
public class VanueController {

    private final VenueService venueService;

    @PostMapping
    public ResponseEntity<VenueDTO> crearLugares (@RequestBody VenueDTO venueDTO){
        Venue venue = venueService.create(VanueMapper.INSTANCE.toModel(venueDTO));
        VenueDTO venueCreated = VanueMapper.INSTANCE.toDTO(venue);
        return ResponseEntity.ok(venueCreated);
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
