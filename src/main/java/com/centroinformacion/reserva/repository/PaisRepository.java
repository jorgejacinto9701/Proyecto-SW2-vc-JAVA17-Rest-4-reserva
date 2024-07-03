package com.centroinformacion.reserva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.reserva.entity.Pais;

public interface PaisRepository extends JpaRepository<Pais, Integer>{
	
	
	public abstract List<Pais> findByOrderByNombreAsc();
	

}
