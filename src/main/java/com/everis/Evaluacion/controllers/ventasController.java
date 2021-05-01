package com.everis.Evaluacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.Evaluacion.models.Venta;
import com.everis.Evaluacion.services.VentaService;

@Controller
public class ventasController {

	@Autowired
	VentaService ventaService;
	
	@RequestMapping("/ventas")
	public String ventas(@RequestParam(value="id") Long id,
			@RequestParam(value="producto") String producto,
			@RequestParam(value="monto") int monto,
			@RequestParam(value="descripcion") String descripcion) {
		
		boolean ventaExist = ventaService.existeVenta(id);
		if(ventaExist) {
			System.out.println("Ya existe una venta con ese ID");
			return "index.jsp";
		}
		else {
			Venta venta = new Venta();
			venta.setId(id);
			venta.setProducto(producto);
			venta.setMonto(monto);
			venta.setDescripcion(descripcion);
			
			venta = ventaService.guardarVenta(venta);
			System.out.println("Venta agregada Exitosamente");
			return "index.jsp";
		}
	}
	
	
	@RequestMapping("/ventas/modificar")
	public String modificarVentas(@RequestParam(value="id") Long id,
			@RequestParam(value="producto") String producto,
			@RequestParam(value="monto") int monto,
			@RequestParam(value="descripcion") String descripcion) {
		
		boolean ventaExist = ventaService.existeVenta(id);
		if(ventaExist) {
			Venta venta = new Venta();
			venta.setId(id);
			venta.setProducto(producto);
			venta.setMonto(monto);
			venta.setDescripcion(descripcion);
			venta = ventaService.guardarVenta(venta);
			
			System.out.println("Venta modificada");
			return "index.jsp";
			
		}
		else {
			
			System.out.println("No existe una venta con ese ID");
			return "index.jsp";
		}
	}
	
}
