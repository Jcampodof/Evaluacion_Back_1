package com.everis.Evaluacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.Evaluacion.models.Usuario;
import com.everis.Evaluacion.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario guardarUsuario(Usuario usuario) {
		System.out.println(usuario.getNombre());
		
		return usuarioRepository.save(usuario);
	}
	
	public Optional<Usuario> buscarId(Long id) {
		return usuarioRepository.findById(id);
	}
	
	public void borrarUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}
	
	public List<Usuario> allUsuario(){
		return usuarioRepository.findAll();
	}
	
	public boolean existeUsuario(Long id) {
		return usuarioRepository.existsById(id);
	}
}
