package com.joshuaJesus.appBanca.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "promociones")
public class Promocion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPromocion;

    @NotBlank
    @Lob
    @Column(name = "descripcion_promocion")
    private String descripcionPromocion;

    @NotBlank
    @Column(name = "valor_promocion")
    private Double valorPromocion;

    @NotBlank
    @Lob
    @Column(name = "condiciones_promocion")
    private String condicionesPromocion;

    @NotBlank
    @Column(name = "fecha_inicio_promocion")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaInicio;

    @NotBlank
    @Column(name = "fecha_fin_promocion")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaFin;

    @NotBlank
    @Column(name = "estado_promocion")
    private Boolean estadoPromocion;


    public Promocion(Long idPromocion) {
        this.idPromocion = idPromocion;
    }

    public Promocion(Long idPromocion, String descripcionPromocion, Double valorPromocion,
                     String condicionesPromocion, LocalDate fechaInicio, LocalDate fechaFin,
                     Boolean estadoPromocion) {
        this.idPromocion = idPromocion;
        this.descripcionPromocion = descripcionPromocion;
        this.valorPromocion = valorPromocion;
        this.condicionesPromocion = condicionesPromocion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoPromocion = estadoPromocion;
    }

    public Long getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(Long idPromocion) {
        this.idPromocion = idPromocion;
    }

    public @NotBlank String getDescripcionPromocion() {
        return descripcionPromocion;
    }

    public void setDescripcionPromocion(@NotBlank String descripcionPromocion) {
        this.descripcionPromocion = descripcionPromocion;
    }

    public @NotBlank Double getValorPromocion() {
        return valorPromocion;
    }

    public void setValorPromocion(@NotBlank Double valorPromocion) {
        this.valorPromocion = valorPromocion;
    }

    public @NotBlank String getCondicionesPromocion() {
        return condicionesPromocion;
    }

    public void setCondicionesPromocion(@NotBlank String condicionesPromocion) {
        this.condicionesPromocion = condicionesPromocion;
    }

    public @NotBlank LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(@NotBlank LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public @NotBlank LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(@NotBlank LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public @NotBlank Boolean getEstadoPromocion() {
        return estadoPromocion;
    }

    public void setEstadoPromocion(@NotBlank Boolean estadoPromocion) {
        this.estadoPromocion = estadoPromocion;
    }
}
