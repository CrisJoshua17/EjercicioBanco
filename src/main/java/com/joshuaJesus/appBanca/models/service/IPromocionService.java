package com.joshuaJesus.appBanca.models.service;

import com.joshuaJesus.appBanca.models.entity.Promocion;

import java.util.List;
import java.util.Optional;

public interface IPromocionService {
    List<Promocion> findAll();
    Optional<Promocion> findbyId(Long id);
    void save(Promocion promocion);
    void delete(Long id);

}
