package com.everis.Evaluacion.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.Evaluacion.models.Producto;
import com.everis.Evaluacion.services.ProductoService;

@RestController
public class ApiProductoController {

	@Autowired
	ProductoService productoService;
	
	//LISTAR PRODUCTOS
	@RequestMapping("/productos/api/lista")
	public List<Producto> listaProductos(){
		
		List<Producto> productoLista = productoService.allProductos();
		return productoLista;
		
	}
	
	//BORRAR PRODUCTO
	@RequestMapping("/productos/api/eliminar/{id}")
	public String eliminarProducto(@PathVariable("id") Long id) {
		
		Optional<Producto> producto = productoService.buscarId(id);
		if (producto.isPresent()) {
			productoService.borrarProducto(id);
			return "Producto Eliminado";
		}
		
		return "No existe producto con ese ID";
	}
	
	//BUSCAR PRODUCTO POR ID
	@RequestMapping("/productos/api/buscar/{id}")
	public Optional<Producto> buscarProducto(@PathVariable("id") Long id){
		Optional<Producto> producto = productoService.buscarId(id);
		return producto;
	}

	
}
