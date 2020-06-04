package com.aiep.a20200601;

public class Deportivo extends Vehiculo{
	
	int iCilindradas;

	public Deportivo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deportivo(String sMatricula, String sModelo, String sColor, String sMarca) {
		super(sMatricula, sModelo, sColor, sMarca);
		// TODO Auto-generated constructor stub
	}

	public int getiCilindradas() {
		return iCilindradas;
	}

	public void setiCilindradas(int iCilindradas) {
		this.iCilindradas = iCilindradas;
	}
	

}
