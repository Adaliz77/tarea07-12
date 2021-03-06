package com.springboot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);

}
