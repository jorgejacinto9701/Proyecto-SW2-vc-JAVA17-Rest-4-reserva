package com.centroinformacion.reserva.service;

import java.util.List;

import com.centroinformacion.reserva.entity.Opcion;
import com.centroinformacion.reserva.entity.Rol;
import com.centroinformacion.reserva.entity.Usuario;

public interface UsuarioService {

	public abstract List<Opcion> traerEnlacesDeUsuario(int idUsuario);

	public abstract List<Rol> traerRolesDeUsuario(int idUsuario);

	public abstract Usuario buscaPorLogin(String login);
}
