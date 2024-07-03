package com.centroinformacion.reserva.service;

import java.util.List;

import com.centroinformacion.reserva.entity.DataCatalogo;

public interface DataCatalogoService {

	public abstract List<DataCatalogo> listaDataCatalogo(int idTipo);
	

}
