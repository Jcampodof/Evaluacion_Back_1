package com.everis.Evaluacion.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.Evaluacion.models.Producto;
import com.everis.Evaluacion.services.ProductoService;

@Controller
public class productosController {

	@Autowired
	ProductoService productoService;
	
	@RequestMapping("/productos")
	public String productos(@RequestParam(value="id") Long id,
			@RequestParam(value="nombre") String nombre,
			@RequestParam(value="precio") int precio,
			@RequestParam(value="descripcion") String descripcion) {
		
		boolean productoExist = productoService.existeProducto(id);
		if (productoExist) {
			System.out.println("Ya existe un producto con ese ID");
			return "index.jsp";
		}
		else {
			Producto producto = new Producto();
			producto.setId(id);
			producto.setNombre(nombre);
			producto.setPrecio(precio);
			producto.setDescripcion(descripcion);
		
			producto = productoService.guardarProducto(producto);
		
			System.out.println("Producto Agregado Exitosamente.");
			return "index.jsp";
		}
		
		
		
	}
	
	//MODIFICAR PRODUCTO
	@RequestMapping("/productos/modificar")
	public String modificarProducto(@RequestParam(value="id") Long id,
			@RequestParam(value="nombre") String nombre,
			@RequestParam(value="precio") int precio,
			@RequestParam(value="descripcion") String descripcion,
			Model model	){
		
		boolean productoExist = productoService.existeProducto(id);
		if (productoExist) {
			Producto producto = new Producto();
			producto.setId(id);
			producto.setNombre(nombre);
			producto.setPrecio(precio);
			producto.setDescripcion(descripcion);
			producto = productoService.guardarProducto(producto);
			System.out.println("Producto Modificado");
			return "index.jsp";
		}
		System.out.println("ID Producto no Existe");
		return "index.jsp";
		
		
	}

	
}
