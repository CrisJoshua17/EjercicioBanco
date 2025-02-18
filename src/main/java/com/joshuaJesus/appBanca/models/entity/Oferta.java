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
@Table(name="ofertas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Oferta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ofertas_seq")
    @SequenceGenerator(name = "ofertas_seq", sequenceName = "OFERTAS_SEQ", allocationSize = 1)
    @Column(name = "id_ofertas")
    private Long idOferta;


    @NotBlank
    @ManyToOne
    @JoinColumn(name = "id_tipo_ofertas", nullable = false)
    private TipoOferta tipoOferta;

    @NotNull
    @Column(name = "estado_oferta")
    private Boolean estadoOferta;

    @NotNull
    @Column(name = "fecha_inicio_oferta")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaInicio;

    @NotNull
    @Column(name = "fecha_fin_oferta")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaFin;
}