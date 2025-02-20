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
@Table(name = "subproductos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubProducto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subproductos_seq")
    @SequenceGenerator(name = "subproductos_seq", sequenceName = "SUBPRODUCTOS_SEQ", allocationSize = 1)
    @Column(name = "id_subproductos")
    private Long idSubproducto;


    @ManyToOne
    @JoinColumn(name = "id_productos", nullable = false)
    private Producto producto;

    @NotBlank
    @Column(name = "nombre_subproducto")
    private String nombreSubproducto;

    @Lob
    @Column(name = "descripcion_subproducto")
    private String descripcionSubproducto;

    @NotNull
    @Column(name = "fecha_creacion_subproducto")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaCreacionSubproducto;

    @NotNull
    @Column(name = "stock_subproducto")
    private Integer stockSubproducto;

    @NotNull
    @Column(name = "precio_subproducto")
    private Double precioSubproducto;

    @NotNull
    @Column(name = "estado_subproducto")
    private Boolean estadoSubproducto;


}


