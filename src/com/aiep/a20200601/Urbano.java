package com.aiep.a20200601;

public class Urbano extends Vehiculo{
	
	boolean automatico;

	public Urbano() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Urbano(String sMatricula, String sModelo, String sColor, String sMarca) {
		super(sMatricula, sModelo, sColor, sMarca);
		// TODO Auto-generated constructor stub
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	
}
