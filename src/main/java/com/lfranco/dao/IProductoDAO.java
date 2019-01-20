package com.lfranco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lfranco.model.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer>{

}
