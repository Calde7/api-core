package com.lfranco.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfranco.dao.IProductoDAO;
import com.lfranco.model.Producto;
import com.lfranco.service.IProductoService;

@Service
public class ProductoService implements IProductoService{
	
	@Autowired
	private IProductoDAO dao;

	@Override
	public Producto guardar(Producto t) {
		return dao.save(t);
	}

	@Override
	public Producto modificar(Producto t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);	
	}

	@Override
	public Producto listarPorId(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Producto> listar() {
		return dao.findAll();
	}

}
