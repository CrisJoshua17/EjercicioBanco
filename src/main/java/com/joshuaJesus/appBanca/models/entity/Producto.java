package com.joshuaJesus.appBanca.models.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="productos")
public class Producto implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idProducto;

    @NotBlank
    @Column(name="nombre_productos")
    private String nombreProducto;

    @Lob
    @Column(name="descripcion_productos")
    private String descripcionProducto;


    @NotNull
    @Column(name="stock_productos")
    private Integer stockProducto;

    @NotNull
    @Column(name="precio_productos")
    private Double precioProducto;

    @NotNull
    @Column(name="estado_productos")
    private Boolean estadoProducto;


    @NotNull
    @Column(name = "fecha_creacion_producto")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaCreacion;


    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubProducto> subproductos;

    public Producto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Long idProducto, String nombreProducto, String descripcionProducto,
                    Integer stockProducto, Double precioProducto, Boolean estadoProducto,
                    LocalDate fechaCreacion) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.stockProducto = stockProducto;
        this.precioProducto = precioProducto;
        this.estadoProducto = estadoProducto;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public @NotBlank String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(@NotBlank String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public @NotNull Integer getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(@NotNull Integer stockProducto) {
        this.stockProducto = stockProducto;
    }

    public @NotNull Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(@NotNull Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public @NotNull Boolean getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(@NotNull Boolean estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public @NotNull LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(@NotNull LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
