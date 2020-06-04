package com.aiep.a20200601;

public class Camioneta extends Vehiculo{

	int iCarga;
	int iVolumen;
	
	public Camioneta() {
		
	}
	
	public Camioneta(int iCarga, int iVolumen) {
		super();
		this.iCarga = iCarga;
		this.iVolumen = iVolumen;
	}

	public Camioneta(String sMatricula, String sModelo, String sColor, String sMarca) {
		super(sMatricula, sModelo, sColor, sMarca);
		// TODO Auto-generated constructor stub
	}
	
	public int getiCarga() {
		return iCarga;
	}

	public void setiCarga(int iCarga) {
		this.iCarga = iCarga;
	}

	public int getiVolumen() {
		return iVolumen;
	}

	public void setiVolumen(int iVolumen) {
		this.iVolumen = iVolumen;
	}



	
	
}
