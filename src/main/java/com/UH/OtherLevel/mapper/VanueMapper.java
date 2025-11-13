package com.UH.OtherLevel.mapper;

import com.UH.OtherLevel.dto.VenueDTO;
import com.UH.OtherLevel.model.Venue;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VanueMapper {
    VanueMapper INSTANCE = Mappers.getMapper(VanueMapper.class);
    VenueDTO toDTO(Venue venue);
    Venue toEntity(VenueDTO venueDTO);

    // Método para actualizar un entity existente desde un DTO
    void updateFromDto(VenueDTO dto, @MappingTarget Venue entity);

}
