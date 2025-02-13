package com.joshuaJesus.appBanca.models.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "subproductos")
public class SubProducto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subproductos")
    private Long idSubproducto;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "id_productos", nullable = false)
    private Producto producto;

    @NotBlank
    @Column(name = "nombre_subproducto")
    private String nombreSubproducto;

    @Lob
    @Column(name = "descripcion_subproducto")
    private String descripcionSubproducto;

    @NotBlank
    @Column(name = "costo_subproducto")
    private Double costoSubproducto;

    @Column(name = "fecha_creacion_subproducto")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDateTime fechaCreacionSubproducto;

    @NotBlank
    @Column(name = "stock_subproducto")
    private Integer stockSubproducto;

    @NotBlank
    @Column(name = "precio_subproducto")
    private Double precioSubproducto;

    @NotBlank
    @Column(name = "estado_subproducto")
    private Boolean estadoSubproducto;

    public SubProducto(Long idSubproducto) {
        this.idSubproducto = idSubproducto;
    }

    public SubProducto(Long idSubproducto, Producto producto, String nombreSubproducto,
                       String descripcionSubproducto, Double costoSubproducto,
                       LocalDateTime fechaCreacionSubproducto, Integer stockSubproducto,
                       Double precioSubproducto, Boolean estadoSubproducto) {
        this.idSubproducto = idSubproducto;
        this.producto = producto;
        this.nombreSubproducto = nombreSubproducto;
        this.descripcionSubproducto = descripcionSubproducto;
        this.costoSubproducto = costoSubproducto;
        this.fechaCreacionSubproducto = fechaCreacionSubproducto;
        this.stockSubproducto = stockSubproducto;
        this.precioSubproducto = precioSubproducto;
        this.estadoSubproducto = estadoSubproducto;
    }

    public Long getIdSubproducto() {
        return idSubproducto;
    }

    public void setIdSubproducto(Long idSubproducto) {
        this.idSubproducto = idSubproducto;
    }

    public @NotBlank Producto getProducto() {
        return producto;
    }

    public void setProducto(@NotBlank Producto producto) {
        this.producto = producto;
    }

    public @NotBlank String getNombreSubproducto() {
        return nombreSubproducto;
    }

    public void setNombreSubproducto(@NotBlank String nombreSubproducto) {
        this.nombreSubproducto = nombreSubproducto;
    }

    public String getDescripcionSubproducto() {
        return descripcionSubproducto;
    }

    public void setDescripcionSubproducto(String descripcionSubproducto) {
        this.descripcionSubproducto = descripcionSubproducto;
    }

    public @NotBlank Double getCostoSubproducto() {
        return costoSubproducto;
    }

    public void setCostoSubproducto(@NotBlank Double costoSubproducto) {
        this.costoSubproducto = costoSubproducto;
    }

    public LocalDateTime getFechaCreacionSubproducto() {
        return fechaCreacionSubproducto;
    }

    public void setFechaCreacionSubproducto(LocalDateTime fechaCreacionSubproducto) {
        this.fechaCreacionSubproducto = fechaCreacionSubproducto;
    }

    public @NotBlank Integer getStockSubproducto() {
        return stockSubproducto;
    }

    public void setStockSubproducto(@NotBlank Integer stockSubproducto) {
        this.stockSubproducto = stockSubproducto;
    }

    public @NotBlank Double getPrecioSubproducto() {
        return precioSubproducto;
    }

    public void setPrecioSubproducto(@NotBlank Double precioSubproducto) {
        this.precioSubproducto = precioSubproducto;
    }

    public @NotBlank Boolean getEstadoSubproducto() {
        return estadoSubproducto;
    }

    public void setEstadoSubproducto(@NotBlank Boolean estadoSubproducto) {
        this.estadoSubproducto = estadoSubproducto;
    }
}


