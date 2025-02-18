package com.joshuaJesus.appBanca.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Entity
@Table(name="tipo_ofertas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoOferta implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_ofertas_seq")
    @SequenceGenerator(name = "tipo_ofertas_seq", sequenceName = "TIPO_OFERTAS_SEQ", allocationSize = 1)
    @Column(name = "id_tipo_oferta")
    private Long id;

    @NotBlank
    @Column(name = "tipo_oferta")
    private String tipoOferta;

    @NotBlank
    @Lob
    @Column(name = "descripcion_tipo_oferta")
    private String descripcion;

    @NotNull
    @Column(name = "estado_tipo_oferta")
    private Boolean estado;

}
