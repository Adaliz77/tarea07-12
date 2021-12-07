package com.springboot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.models.entity.Alumno;

public interface AlumnoDao extends CrudRepository<Alumno, Long>{

}
