package com.springboot.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.models.entity.Alumno;
import com.springboot.models.service.AlumnoService;


@RestController
@RequestMapping("/api")
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	//Listar todos los alumnos
		@GetMapping("/alumnos")
		public List<Alumno> mostrarTodos() {
			return alumnoService.findAll();
		}
	
		//Listar alumonos por ID
	@GetMapping("/alumnos/{id}")
	public ResponseEntity<?> mostrarId(@PathVariable Long id) {
		Alumno alumno = null;
		Map<String, Object> response = new HashMap<>();

		try {
			alumno = alumnoService.findById(id);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (alumno == null) {
			response.put("mensaje", "El alumno ID: ".concat(id.toString().concat(" no existe en la bbdd")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Alumno>(alumno, HttpStatus.OK);
	}
	
	//Guardar alumno
	@PostMapping("/alumnos")
	public ResponseEntity<?> guardar(@RequestBody Alumno alumno) {
		Alumno alumnoNew = null;
		Map<String, Object> response = new HashMap<>();

		try {
			alumnoService.save(alumno);

		} catch (DataAccessException e) {
			response.put("Mensaje", "No se puede guardar el alumno");
			response.put("Error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje", "El alumno ha sido creado con éxito!");
		response.put("cliente", alumnoNew);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	//Actualizar datos de un alumno
	@PutMapping("/alumnos/{id}")
	public ResponseEntity<?> actualizar(@RequestBody Alumno alumno, @PathVariable Long id) {

		Alumno alumnoActual = alumnoService.findById(id);
		Alumno alumnoUpdated = null;

		Map<String, Object> response = new HashMap<>();

		if (alumnoActual == null) {
			response.put("mensaje", "Error no se pudo editar, el alumno ID: ".concat(id.toString().concat(" no existe el id en la base de datos")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}

		try {
			alumnoActual.setNombre(alumno.getNombre());
			alumnoActual.setApellido(alumno.getApellido());
			alumnoActual.setEmail(alumno.getEmail());
			alumnoActual.setTelefono(alumno.getTelefono());
			alumnoActual.setCurso(alumno.getCurso());
			alumnoUpdated = alumnoService.save(alumnoActual);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al actualizar en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
			response.put("mensaje", "El Alumno ha sido actualizado con éxito");
			response.put("alumno", alumnoUpdated);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		}
	
	//Borrar alumno
	@DeleteMapping("/alumnos/{id}")
	public ResponseEntity<?> borrar(@PathVariable Long id) {
		Map<String, Object> response = new HashMap<>();

		try {
			alumnoService.delete(id);
		} catch (DataAccessException e) {
			response.put("Mensaje", "No se ha podido borrar el alumno");
			response.put("Error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje", "El alumno ha sido eliminado con éxito!");
		return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
	}

		



}
