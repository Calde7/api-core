package com.lfranco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lfranco.model.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}
