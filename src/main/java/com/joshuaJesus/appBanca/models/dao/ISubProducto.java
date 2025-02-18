package com.joshuaJesus.appBanca.models.dao;

import com.joshuaJesus.appBanca.models.entity.SubProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubProducto extends JpaRepository<SubProducto, Long> {
}
