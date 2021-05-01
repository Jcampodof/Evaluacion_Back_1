package com.everis.Evaluacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.Evaluacion.models.Usuario;
import com.everis.Evaluacion.services.UsuarioService;

@Controller
public class usuariosController {

	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("/usuarios")
	public String usuarios(@RequestParam(value="idu") Long id,
			@RequestParam(value="nombreu") String nombre,
			@RequestParam(value="passu") String pass,
			@RequestParam(value="correou") String correo,
			@RequestParam(value="edadu") int edad, 
			Model model) {
		
		boolean usuarioExist = usuarioService.existeUsuario(id);
		if (usuarioExist) {
			System.out.println("Ya existe un usuario con ese ID");
			return "index.jsp";
		}
		else {
			Usuario usuario = new Usuario();
			usuario.setId(id);
			usuario.setNombre(nombre);
			usuario.setPass(pass);
			usuario.setCorreo(correo);
			usuario.setEdad(edad);
		
			usuario = usuarioService.guardarUsuario(usuario);
		
			System.out.println("Usuario Agregado Exitosamente.");
			return "index.jsp";
		}
		
		
		
	}
	
	//MODIFICAR USUARIO
	@RequestMapping("/usuarios/modificar")
	public String modificarUsuario(@RequestParam(value="id") Long id,
			@RequestParam(value="nombre") String nombre,
			@RequestParam(value="pass") String pass,
			@RequestParam(value="correo") String correo,
			@RequestParam(value="edad") int edad){
		
		boolean usuarioExist = usuarioService.existeUsuario(id);
		if (usuarioExist) {
			Usuario usuario = new Usuario();
			usuario.setId(id);
			usuario.setNombre(nombre);
			usuario.setPass(pass);
			usuario.setCorreo(correo);
			usuario.setEdad(edad);
			usuario = usuarioService.guardarUsuario(usuario);
			System.out.println("Usuario Modificado");
			return "index.jsp";
		}
		System.out.println("ID Usuario no Existe");
		return "index.jsp";
		
		
	}

}
