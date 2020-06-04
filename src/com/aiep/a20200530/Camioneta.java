package com.aiep.a20200530;

public class Camioneta extends Auto{

	String sTara;
	Float fPeso;

	//set & get
	public String getsTara() {
		return sTara;
	}

	public void setsTara(String sTara) {
		this.sTara = sTara;
	}

	public Float getfPeso() {
		return fPeso;
	}

	public void setfPeso(Float fPeso) {
		this.fPeso = fPeso;
	}

	//constructores
	public Camioneta() {}
	
	public Camioneta(String sTara, Float fPeso) {
		super();
		this.sTara = sTara;
		this.fPeso = fPeso;
	}

	public Camioneta(String sMarca, String sColor, Float fVelocidad) {
		super(sMarca, sColor, fVelocidad);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
