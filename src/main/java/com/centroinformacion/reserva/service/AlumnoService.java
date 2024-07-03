package com.centroinformacion.reserva.service;

import java.util.List;

import com.centroinformacion.reserva.entity.Alumno;

public interface AlumnoService {

	public abstract List<Alumno> listaTodos();
	public abstract Alumno insertaAlumno(Alumno obj);

}
