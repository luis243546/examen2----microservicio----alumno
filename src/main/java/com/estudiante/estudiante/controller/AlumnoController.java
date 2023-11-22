package com.estudiante.estudiante.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudiante.estudiante.entity.Alumno;
import com.estudiante.estudiante.service.AlumnoService;

@RestController
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/lista1")
	public List<Alumno> verTodo() {
		return alumnoService.listar();
	}

	@GetMapping("/lista1/{id}")
	public Alumno verUno(@PathVariable Long id) {
		return alumnoService.verUno(id);
	}

	@PostMapping("/registrar3")
	public Alumno registar(@RequestBody Alumno empleado){
		return alumnoService.registrar(empleado);
	}

	@PutMapping("/actualizar3/{id}")
	public Alumno actualizar(@RequestBody Alumno empleado, @PathVariable Long id){
		return alumnoService.actualizar(empleado,id);
	}

	@DeleteMapping("/eliminar3/{id}")
	public void eliminar(@PathVariable Long id){
		alumnoService.eliminar(id);
	}
}
