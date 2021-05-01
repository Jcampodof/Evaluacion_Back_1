package com.everis.Evaluacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.Evaluacion.models.Venta;
import com.everis.Evaluacion.repositories.VentaRepository;

@Service
public class VentaService {
	
	@Autowired
	VentaRepository ventaRepository;
	
	public Venta guardarVenta(Venta venta) {
		System.out.println(venta.getProducto());
		return ventaRepository.save(venta);
	}
	
	public Optional<Venta> buscarId(Long id){
		return ventaRepository.findById(id);
	}
	
	public void borrarVenta(Long id) {
		ventaRepository.deleteById(id);
	}
	
	public List<Venta> allVentas(){
		return ventaRepository.findAll();
	}
	
	public boolean existeVenta(Long id) {
		return ventaRepository.existsById(id);
	}
}
