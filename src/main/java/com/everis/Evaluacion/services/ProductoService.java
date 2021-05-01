package com.everis.Evaluacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.Evaluacion.models.Producto;
import com.everis.Evaluacion.repositories.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;
	
	public Producto guardarProducto(Producto producto) {
		System.out.println(producto.getNombre());
		
		return productoRepository.save(producto);
	}
	
	public Optional<Producto> buscarId(Long id) {
		return productoRepository.findById(id);
	}
	
	public void borrarProducto(Long id) {
		productoRepository.deleteById(id);
	}
	
	public List<Producto> allProductos(){
		return productoRepository.findAll();
	}
	
	public boolean existeProducto(Long id) {
		return productoRepository.existsById(id);
	}
	
}
