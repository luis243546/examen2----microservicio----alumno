package com.estudiante.estudiante.repository;

import org.springframework.data.repository.CrudRepository;

import com.estudiante.estudiante.entity.Alumno;

public interface AlumnoDao extends CrudRepository<Alumno, Long>{
    
}
