package com.actividad04.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.actividad04.entity.Deporte;
import com.actividad04.entity.Modalidad;

public interface DeporteRepository extends JpaRepository<Deporte, Integer>{
	public abstract List<Modalidad> findByNombre(String nombre);

}
