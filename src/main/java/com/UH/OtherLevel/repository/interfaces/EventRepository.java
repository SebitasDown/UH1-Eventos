package com.UH.OtherLevel.repository.interfaces;

import com.UH.OtherLevel.model.Event;
import com.UH.OtherLevel.model.Venue;

import java.util.List;
import java.util.Optional;

public interface EventRepository {
    List<Event> findAll();
    Optional<Event> findById(Long id);
    Event save(Event event);
    boolean deleteById (Long id);
    boolean existById(Long id);
}
