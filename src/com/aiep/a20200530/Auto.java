package com.aiep.a20200530;

public class Auto {
//campos o variables
	String sMarca;
	String sColor;
	Float fVelocidad;
	
//metodos o funciones
	
	public void acelerar() {
		fVelocidad ++;
	}
	
	public void frenar() {
		fVelocidad=0F;
	}
	
//constructores	
	// constructor vacio
	
	public Auto() {
		
	}

	public Auto(String sMarca, String sColor, Float fVelocidad) {
		super();
		this.sMarca = sMarca;
		this.sColor = sColor;
		this.fVelocidad = fVelocidad;
	}

	//set & get
	
	public String getsMarca() {
		return sMarca;
	}

	public void setsMarca(String sMarca) {
		this.sMarca = sMarca;
	}

	public String getsColor() {
		return sColor;
	}

	public void setsColor(String sColor) {
		this.sColor = sColor;
	}

	public Float getfVelocidad() {
		return fVelocidad;
	}

	public void setfVelocidad(Float fVelocidad) {
		this.fVelocidad = fVelocidad;
	}

	@Override
	public String toString() {
		return "Clase to String";
		//return "Auto [sMarca=" + this.sMarca + ", sColor=" + sColor + ", fVelocidad=" + fVelocidad + "]";
	}
	

	
	

}
