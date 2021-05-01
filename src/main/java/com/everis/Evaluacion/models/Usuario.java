package com.everis.Evaluacion.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	private Long id;
	@Size(min=3, max =20)
	private String nombre;
	@Size(min=3, max=20)
	private String pass;
	@Size(min=5, max=50)
	private String correo;
	@Max(110)
	@Min(3)
	private Integer edad;
	
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    public Usuario() {}


	public Usuario(Long id, @Size(min = 3, max = 20) String nombre, @Size(min = 3, max = 20) String pass,
			@Size(min = 5, max = 50) String correo, @Max(110) @Min(3) Integer edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pass = pass;
		this.correo = correo;
		this.edad = edad;
	}



	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
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
