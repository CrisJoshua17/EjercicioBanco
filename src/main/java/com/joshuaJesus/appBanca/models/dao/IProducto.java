package com.joshuaJesus.appBanca.models.dao;

import com.joshuaJesus.appBanca.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProducto extends JpaRepository<Producto,Long> {
}
