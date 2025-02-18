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
import java.util.List;

@Entity
@Table(name="productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE )
    @Column(name="id_productos")
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
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaCreacion;


    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubProducto> subproductos;


}
