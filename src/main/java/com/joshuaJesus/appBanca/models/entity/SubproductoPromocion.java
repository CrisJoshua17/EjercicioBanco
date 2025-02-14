package com.joshuaJesus.appBanca.models.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "subproductos_promociones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubproductoPromocion implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_subproductos", nullable = false)
    @Column(name = "id_subproductos")
    private SubProducto subproducto;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_promociones", nullable = false)
    private Promocion promocion;


}
