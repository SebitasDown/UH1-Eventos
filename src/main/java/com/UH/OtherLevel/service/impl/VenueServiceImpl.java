package com.UH.OtherLevel.service.impl;

import com.UH.OtherLevel.model.Venue;
import com.UH.OtherLevel.repository.interfaces.VenueRepository;
import com.UH.OtherLevel.service.VenueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VenueServiceImpl implements VenueService {

    private final VenueRepository venueRepository;

    @Override
    public Venue create(Venue venue) {

        return venueRepository.save(venue);
    }

    @Override
    public Venue update(Venue venue) {
        return null;
    }

    @Override
    public List<Venue> getVanueAll() {

        //Aqui va la logica de negocio para que no se manden datos que no son correctos por ejemplo en el metodo crear
        return venueRepository.findAll();
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
