package com.joshuaJesus.appBanca.models.dao;

import com.joshuaJesus.appBanca.models.entity.Producto;
import com.joshuaJesus.appBanca.models.entity.SubProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProducto extends JpaRepository<Producto,Long> {

    @Query("select s from SubProducto s left join fetch s.productos c where c.id = ?1")
     public List<SubProducto> findSubProductosByProductoId(Long id);
}
