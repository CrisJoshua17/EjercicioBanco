package com.joshuaJesus.appBanca.models.entity;




import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "subproductos_ofertas")
public class SubproductoOferta implements Serializable {


    @Id
    @ManyToOne
    @JoinColumn(name = "id_subproductos", nullable = false)
    private SubProducto subproducto;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_ofertas", nullable = false)
    private Oferta oferta;

}
