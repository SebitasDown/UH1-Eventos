package com.UH.OtherLevel.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VenueDTO {
    private Long id;

    @NotBlank(message = "El nombre del venue no puede estar vacío")
    private String name;

    @NotBlank(message = "La dirección es obligatoria")
    private String address;

    @NotNull(message = "La capacidad es obligatoria")
    private Integer capacity;
}
