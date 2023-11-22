package com.estudiante.estudiante.service;

import com.estudiante.estudiante.entity.Alumno;

import java.util.List;

public interface AlumnoService {
    public List<Alumno> listar();
	
	public Alumno verUno(Long id);

    public Alumno registrar(Alumno alumno);

    public Alumno actualizar(Alumno alumno, Long id);

    public void eliminar(Long id);
}
