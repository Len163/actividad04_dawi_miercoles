package com.actividad04.service;

import java.util.List;
import java.util.Optional;

import com.actividad04.entity.Modalidad;



public interface ModalidadService {

	public abstract List<Modalidad> listaModalidad();
	public abstract Modalidad insertaActualizaModalidad(Modalidad obj);
	public abstract Optional<Modalidad> obtienePorId(int idModalidad);
	public abstract void eliminaModalidad(int id);
	public abstract List<Modalidad> listaModalidadPorNombreLike(String filtro);
	

}
