package com.joshuaJesus.appBanca.models.service;

import com.joshuaJesus.appBanca.models.entity.SubProducto;
import com.joshuaJesus.appBanca.models.entity.SubproductoOferta;
import com.joshuaJesus.appBanca.models.entity.SubproductoPromocion;

import java.util.List;
import java.util.Optional;

public interface ISubproductoService {

    public List<SubProducto> findAll();
    public Optional<SubProducto> findById(Long id);
    public void save (SubProducto subproducto);
    public void delete(Long id);
    public List<SubproductoPromocion> findAllSubproductoPromociones();
    public List<SubproductoOferta> findAllSubproductoOfertas();



}
