package com.joshuaJesus.appBanca.models.service;

import com.joshuaJesus.appBanca.models.entity.Producto;
import com.joshuaJesus.appBanca.models.entity.SubProducto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

    public List<Producto> findAll();
    public Optional<Producto> findById(Long id);
    public void save (Producto producto);
    public void delete(Long id);
    public List<SubProducto> findAllSubproductos();
    public List<SubProducto> findSubProductosByProductoId(Long idProducto);
}
