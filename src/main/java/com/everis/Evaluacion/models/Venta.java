package com.everis.Evaluacion.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ventas")
public class Venta {
	@Id
    private Long id;
    @Size(min=4, max=50)
    private String producto;
    @Min(0)
    private Integer monto;
	@Size(min=0, max=100)
    private String descripcion;
	

	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    public Venta() {}

	public Venta(Long id, @Size(min = 4, max = 50) String producto, @Min(0) Integer monto,
			@Size(min = 0, max = 100) String descripcion) {
		super();
		this.id = id;
		this.producto = producto;
		this.monto = monto;
		this.descripcion = descripcion;
	}



	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Integer getMonto() {
		return monto;
	}

	public void setMonto(Integer monto) {
		this.monto = monto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	 // Otros getters y setters fueron removidos para resumir
	@PrePersist
   protected void onCreate(){
       this.createdAt = new Date();
   }
   @PreUpdate
   protected void onUpdate(){
       this.updatedAt = new Date();
   }
	
    
	
}
