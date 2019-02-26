package com.lfranco.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfranco.dao.IVentaDAO;
import com.lfranco.model.Venta;
import com.lfranco.service.IVentaService;

@Service
public class VentaServiceImpl implements IVentaService{
	
	@Autowired
	private IVentaDAO dao;

	@Override
	public Venta guardar(Venta t) {
		t.getDetalleVenta().forEach(det -> det.setVenta(t));
		return dao.save(t);
	}

	@Override
	public Venta modificar(Venta t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Venta listarPorId(int id) {
		//return dao.findOne(id);
		return dao.findByIdOptimize(id);
	}

	@Override
	public List<Venta> listar() {
		return dao.findAllOptimize();
	}

}
