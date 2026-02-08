package com.conecta.dto;

import com.conecta.model.Demanda;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Datos de una demanda")
public record DemandaDTO(
    @Schema(description = "ID de la demanda", example = "1")
    Long id,

    @Schema(description = "Cantidad de alumnos requeridos", example = "5")
    Integer cantidadAlumnos,

    @Schema(description = "Requisitos de la demanda", example = "Conocimientos de Java y Spring")
    String requisitos,

    @Schema(description = "ID de la empresa asociada", example = "1")
    Long empresaId,

    @Schema(description = "ID del curso asociado", example = "1")
    Long cursoId
) {
    
    public static DemandaDTO fromEntity(Demanda demanda) {
        return new DemandaDTO(
                demanda.getId(),
                demanda.getCantidadAlumnos(),
                demanda.getRequisitos(),
                demanda.getEmpresa().getId(),
                demanda.getCurso().getId()
        );
    }
}
