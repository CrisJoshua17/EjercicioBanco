package com.joshuaJesus.appBanca.models.service.Impl;

import com.joshuaJesus.appBanca.models.dao.IProducto;
import com.joshuaJesus.appBanca.models.dao.ISubProducto;
import com.joshuaJesus.appBanca.models.entity.Producto;
import com.joshuaJesus.appBanca.models.entity.SubProducto;
import com.joshuaJesus.appBanca.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class IProductoImpl implements IProductoService {


    @Autowired
    private IProducto productoDao;

    @Autowired
    private ISubProducto subProductoDao;

    @Override
    public List<Producto> findAll() {
       return productoDao.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return productoDao.findById(id);
    }

    @Override
    public void save(Producto producto) {
         productoDao.save( producto);

    }

    @Override
    public void delete(Long id) {
        productoDao.deleteById(id);

    }

    @Override
    public List<SubProducto> findAllSubproductos() {
        return subProductoDao.findAll();
    }

    @Override
    public List<SubProducto> findSubProductosByProductoId(Long idProducto) {
        return productoDao.findSubProductosByProductoId(idProducto);
    }
}
