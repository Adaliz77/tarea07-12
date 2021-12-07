package com.springboot.models.service;

import java.util.List;

import com.springboot.models.entity.Alumno;

public interface AlumnoService {
	public List<Alumno> findAll();

	public Alumno findById(Long id);

	public Alumno save(Alumno alumno);

	public void delete(Long id);

}
