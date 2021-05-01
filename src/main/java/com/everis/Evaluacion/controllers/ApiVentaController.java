package com.everis.Evaluacion.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.Evaluacion.models.Venta;
import com.everis.Evaluacion.services.VentaService;

@RestController
public class ApiVentaController {
	
	@Autowired
	VentaService ventaService;
	
	//LISTAR VENTAS
	@RequestMapping("/ventas/api/lista")
	public List<Venta> listaVentas(){
		
		List<Venta> ventaLista = ventaService.allVentas();
		return ventaLista;
	}
	
	//BORRAR VENTA
	@RequestMapping("/ventas/api/eliminar/{id}")
	public String eliminarVenta(@PathVariable("id") Long id) {
		
		Optional<Venta> venta = ventaService.buscarId(id);
		if(venta.isPresent()) {
			ventaService.borrarVenta(id);
			return "Venta Eliminada";
		}
		return "No existe venta con ese ID";
	}
	
	//BUSCAR VENTA POR ID
	@RequestMapping("/ventas/api/buscar/{id}")
	public Optional<Venta> buscarVenta(@PathVariable("id") Long id){
		Optional<Venta> venta = ventaService.buscarId(id);
		return venta;
	}
	
}
