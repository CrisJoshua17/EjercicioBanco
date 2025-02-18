package com.joshuaJesus.appBanca.models.service;

import com.joshuaJesus.appBanca.models.entity.Oferta;
import com.joshuaJesus.appBanca.models.entity.TipoOferta;

import java.util.List;
import java.util.Optional;

public interface IOfertaService {

    public List<Oferta> findAll();

    public Optional<Oferta> findOne(Long id);

    public void save (Oferta oferta);

    public void delete(Long id);

    public List<TipoOferta> findAllTipoOfertas();



}
