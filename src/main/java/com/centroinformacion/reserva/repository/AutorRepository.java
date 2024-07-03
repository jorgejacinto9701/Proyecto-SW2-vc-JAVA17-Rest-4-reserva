package com.centroinformacion.reserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centroinformacion.reserva.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor,Integer> {

}
