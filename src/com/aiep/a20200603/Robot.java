package com.aiep.a20200603;

public class Robot {

	String nombre = "Bender";
	Double dPeso= 400.5;

	public Robot() {
	
	}

	public Robot(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Robot(String nombre, Double dPeso) {
		super();
		this.nombre = nombre;
		this.dPeso = dPeso;
	}
	
//set and get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//funciones o métodos
	
	public Double getdPeso() {
		return dPeso;
	}

	public void setfdPeso(Double dPeso) {
		this.dPeso = dPeso;
	}

	public void obtenerNombreRobot() { 
		//FvF = F; V^V= V; v->F= F; V<->V= V ; F<->F= V
		if(this.nombre == null || this.nombre.equals("")|| this.nombre.isEmpty()) 
		{
			System.out.println("is null or Is Empty or vacio");
			
		}else {
			System.out.println("Hola me llamo "+ this.nombre);
		}
		
		obtenerPeso();
		
	}
	
	private void obtenerPeso() {
		System.out.println("El peso del robot es: "+ this.dPeso);
	}

	
}
