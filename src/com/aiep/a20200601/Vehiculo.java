package com.aiep.a20200601;

public class Vehiculo {

	String sMatricula;
	String sModelo;
	String sColor;
	String sMarca;
	
	public Vehiculo() {
		
	}

	public Vehiculo(String sMatricula,String sModelo,String sColor, String sMarca) {
		
		this.sMatricula = sMatricula;
		this.sModelo = sModelo;
		this.sColor = sColor;
		this.sMarca = sMarca;
		
	}
	
	public String getsMatricula() {
		return sMatricula;
	}

	public void setsMatricula(String sMatricula) {
		this.sMatricula = sMatricula;
	}

	public String getsModelo() {
		return sModelo;
	}

	public void setsModelo(String sModelo) {
		this.sModelo = sModelo;
	}

	public String getsColor() {
		return sColor;
	}

	public void setsColor(String sColor) {
		this.sColor = sColor;
	}

	public String getsMarca() {
		return sMarca;
	}

	public void setsMarca(String sMarca) {
		this.sMarca = sMarca;
	}

	
}
