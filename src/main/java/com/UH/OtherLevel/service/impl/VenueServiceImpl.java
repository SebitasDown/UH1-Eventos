package com.UH.OtherLevel.service.impl;

import com.UH.OtherLevel.model.Venue;
import com.UH.OtherLevel.repository.interfaces.VenueRepository;
import com.UH.OtherLevel.service.VenueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VenueServiceImpl implements VenueService {

    private final VenueRepository venueRepository;

    @Override
    public Venue create(Venue venue) {

        return venueRepository.save(venue);
    }
}
