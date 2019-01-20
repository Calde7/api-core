package com.lfranco.service;

import java.util.List;

public interface ICRUD<T> {

	T guardar(T t);
	T modificar(T t);
	void eliminar(int id);
	T listarPorId(int id);
	List<T> listar();
}
