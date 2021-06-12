package com.actividad04.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.actividad04.entity.Modalidad;
import com.actividad04.service.DeporteService;
import com.actividad04.service.ModalidadService;



@RestController
@RequestMapping("/rest/modalidad")
public class ModalidadController {
	
	@Autowired
	private DeporteService deporteService;

	@Autowired
	private ModalidadService modalidadService;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Modalidad>> listaModalidad(){
		List<Modalidad> lista = modalidadService.listaModalidad();
		return ResponseEntity.ok(lista);
	}

}




