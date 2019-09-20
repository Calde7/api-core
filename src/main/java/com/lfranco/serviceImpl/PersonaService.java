package com.lfranco.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfranco.dao.IPersonaDAO;
import com.lfranco.model.Persona;
import com.lfranco.service.IPersonaService;

@Service
public class PersonaService implements IPersonaService{
	
	@Autowired
	private IPersonaDAO dao;

	@Override
	public Persona guardar(Persona t) {
		return dao.save(t);
	}

	@Override
	public Persona modificar(Persona t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Persona listarPorId(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Persona> listar() {
		return dao.findAll();
	}

}
