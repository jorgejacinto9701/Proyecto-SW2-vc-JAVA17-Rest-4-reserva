package com.centroinformacion.reserva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroinformacion.reserva.entity.Proveedor;
import com.centroinformacion.reserva.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService {
	
	@Autowired
	private ProveedorRepository repository;
	
	@Override
	public List<Proveedor> listaProveedor() {
		return repository.findAll();
	}

	@Override
	public Proveedor instertaProveedor(Proveedor obj) {
		return repository.save(obj);
	}
}
