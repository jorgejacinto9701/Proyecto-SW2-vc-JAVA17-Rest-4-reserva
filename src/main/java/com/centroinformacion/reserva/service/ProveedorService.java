package com.centroinformacion.reserva.service;

import java.util.List;

import com.centroinformacion.reserva.entity.Proveedor;

public interface ProveedorService {
	
	public abstract List<Proveedor> listaProveedor();
	public abstract Proveedor instertaProveedor(Proveedor obj);

}
