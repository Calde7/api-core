package com.lfranco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lfranco.model.Persona;

public interface IPersonaDAO extends JpaRepository<Persona, Integer>{

}
