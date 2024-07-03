package com.centroinformacion.reserva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroinformacion.reserva.entity.Editorial;
import com.centroinformacion.reserva.repository.EditorialRepository;

@Service
public class EditorialServiceImpl implements EditorialService {

	@Autowired
	private EditorialRepository repository;

	@Override
	public Editorial registrarEditorial(Editorial editorial) {

		return repository.save(editorial);

	}

}
