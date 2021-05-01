package com.everis.Evaluacion.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.Evaluacion.models.Venta;

@Repository
public interface VentaRepository extends CrudRepository<Venta, Long>{
	
	List<Venta> findAll();

}
