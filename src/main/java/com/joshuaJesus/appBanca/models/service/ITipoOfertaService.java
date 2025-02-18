package com.joshuaJesus.appBanca.models.service;

import com.joshuaJesus.appBanca.models.entity.TipoOferta;

import java.util.List;
import java.util.Optional;

public interface ITipoOfertaService {

    List<TipoOferta> findAll();
    Optional<TipoOferta> findById(Long id);
    void save(TipoOferta tipoOferta);
    void delete(Long id);
}
