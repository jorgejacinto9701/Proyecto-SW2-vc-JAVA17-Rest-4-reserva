package com.centroinformacion.reserva.service;

import java.util.List;

import com.centroinformacion.reserva.entity.Ejemplo;

public interface EjemploService {

	public abstract Ejemplo insertaActualizaEjemplo(Ejemplo obj);
	public abstract List<Ejemplo> listaEjemplo();
}
