package com.lfranco.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lfranco.model.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{
	
	/*@Query(value = "SELECT c FROM Venta c JOIN FETCH c.persona "
			+ "JOIN FETCH c.proveedor")   
    List<Venta> findAll();*/
	
}
