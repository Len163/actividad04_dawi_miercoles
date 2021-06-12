package com.actividad04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.actividad04.entity.Deporte;
import com.actividad04.repository.DeporteRepository;


@Service
public class DeporteServiceImpl implements DeporteService {

	@Autowired
	private DeporteRepository repository;
	
	@Override
	public List<Deporte> listaDeporte() {
		return repository.findAll();
	}

}
