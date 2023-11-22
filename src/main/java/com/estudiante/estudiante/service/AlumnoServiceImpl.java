package com.estudiante.estudiante.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudiante.estudiante.entity.Alumno;
import com.estudiante.estudiante.repository.AlumnoDao;

@Service
public class AlumnoServiceImpl implements AlumnoService{

    @Autowired
    AlumnoDao alumnoDao;

    @Override
    public List<Alumno> listar() {
        return (List<Alumno>) alumnoDao.findAll();
    }

    @Override
    public Alumno verUno(Long id) {
        return alumnoDao.findById(id).orElse(null);
    }

    @Override
    public Alumno registrar(Alumno alumno) {
        return alumnoDao.save(alumno);
    }

    @Override
    public Alumno actualizar(Alumno object, Long id) {
        Optional<Alumno> objectExistenteOptional = alumnoDao.findById(id);

        if (objectExistenteOptional.isPresent()) {
			Alumno alumnoExistente = objectExistenteOptional.get();

			alumnoExistente.setNombre(object.getNombre());
			alumnoExistente.setFecha_nacimiento(object.getFecha_nacimiento());
			alumnoExistente.setNota1(object.getNota1());
			alumnoExistente.setNota2(object.getNota2());
			alumnoExistente.setNota3(object.getNota3());
			

			return alumnoDao.save(alumnoExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        alumnoDao.deleteById(id);
    }
    
}
