package com.aiep.a20200610.objeto;

public class Pacientes {
	
	private String nombre;
	private String apellido;
	private String dni;
	private String ssalud;
	private String direccion;
	private int edad;
	
	//set and get

	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getSsalud() {
		return ssalud;
	}
	public void setSsalud(String ssalud) {
		this.ssalud = ssalud;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//constructor 
	public Pacientes(String nombre, String apellido, String dni, String ssalud, String direccion, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.ssalud = ssalud;
		this.direccion = direccion;
		this.edad = edad;
	}
	
	
	

}
