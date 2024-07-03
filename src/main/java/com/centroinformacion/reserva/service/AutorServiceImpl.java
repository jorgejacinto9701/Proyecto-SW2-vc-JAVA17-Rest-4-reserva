package com.centroinformacion.reserva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroinformacion.reserva.entity.Autor;
import com.centroinformacion.reserva.repository.AutorRepository;

@Service
public class AutorServiceImpl implements AutorService {
	
	@Autowired
	private AutorRepository repository;
	
	@Override
	public Autor insertaActualizaAutor(Autor obj) {
		return repository.save(obj);
		
	}

	@Override
	public List<Autor> listaAutor() {
		return repository.findAll();
	}

}
