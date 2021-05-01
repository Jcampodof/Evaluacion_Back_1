package com.everis.Evaluacion.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.everis.Evaluacion.models.Usuario;
import com.everis.Evaluacion.services.UsuarioService;

@RestController
public class ApiUsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("/usuarios/api/lista")
	public List<Usuario> listaUsuarios(){
		
		List<Usuario> usuarioLista = usuarioService.allUsuario();
		return usuarioLista;
	}
	
	@RequestMapping("/usuarios/api/eliminar/{id}")
	public String eliminarUsuario(@PathVariable("id") Long id) {
		
		Optional<Usuario> usuario = usuarioService.buscarId(id);
		if (usuario.isPresent()) {
			usuarioService.borrarUsuario(id);
			return "Usuario Eliminado";
		}
		
		return "No existe usuario con ese ID";
	}
	
	@RequestMapping("/usuarios/api/buscar/{id}")
	public Optional<Usuario> buscarUsuario(@PathVariable("id") Long id){
		Optional<Usuario> usuario = usuarioService.buscarId(id);
		return usuario;
	}
}
