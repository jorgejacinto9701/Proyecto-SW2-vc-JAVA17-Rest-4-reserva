package com.centroinformacion.reserva.service;

import java.util.List;

import com.centroinformacion.reserva.entity.Sala;

public interface SalaService {
	public abstract Sala insertaActualizaSala(Sala obj);
	public abstract List<Sala> listaSala();
}
