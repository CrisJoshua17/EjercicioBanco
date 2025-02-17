package com.joshuaJesus.appBanca.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;



@Entity
@Table(name = "promociones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Promocion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_promociones")
    private Long idPromocion;

    @NotBlank
    @Lob
    @Column(name = "descripcion_promocion")
    private String descripcionPromocion;

    @NotNull
    @Column(name = "valor_promocion")
    private Double valorPromocion;

    @NotBlank
    @Lob
    @Column(name = "condiciones_promocion")
    private String condicionesPromocion;

    @NotNull
    @Column(name = "fecha_inicio_promocion")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaInicio;

    @NotNull
    @Column(name = "fecha_fin_promocion")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaFin;

    @NotNull
    @Column(name = "estado_promocion")
    private Boolean estadoPromocion;



}
