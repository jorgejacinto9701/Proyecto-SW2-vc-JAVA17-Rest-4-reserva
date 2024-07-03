package com.centroinformacion.reserva.service;

import java.util.List;

import com.centroinformacion.reserva.entity.Libro;


public interface LibroService {
	
	public abstract List<Libro> listaLibro();
	public abstract Libro insertarLibro(Libro obj);

}
