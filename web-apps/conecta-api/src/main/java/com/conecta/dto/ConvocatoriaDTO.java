package com.conecta.dto;

import com.conecta.model.Convocatoria;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Datos de una convocatoria")
public record ConvocatoriaDTO(
    @Schema(description = "ID de la convocatoria", example = "1")
    Long id,

    @Schema(description = "Curso escolar de la convocatoria", example = "2023-2024")
    String cursoEscolar,

    @Schema(description = "Nombre de la convocatoria", example = "Convocatoria Ordinaria DAW")
    String nombre

) {
    
    public static ConvocatoriaDTO fromEntity(Convocatoria convocatoria) {
        return new ConvocatoriaDTO(
            convocatoria.getId(),
            convocatoria.getCursoEscolar(),
            convocatoria.getNombre()
        );
    }
}