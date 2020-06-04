package com.aiep.a20200530;

import java.util.Scanner;

public class MainAiep {

	public MainAiep() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//instancia de la clase
		Auto vAuto = new Auto();
		//definir una variable
		String sColorAuto =  "negro";
		
		//seteando valores a variable de tipo auto
		vAuto.setsColor(sColorAuto);
		vAuto.setfVelocidad(300F);
		vAuto.setsMarca("Peugeot");
		
		//get (obtener)
		System.out.println(vAuto.getsMarca());
		System.out.println(vAuto.getsColor());
		System.out.println(vAuto.getfVelocidad());
		
		Auto vAuto2 = new Auto("Nissan","Rojo",320F);
		
		vAuto2.toString();
		vAuto.toString();
		
		
		//instanciar a camioneta
		
		//Camioneta camioneta = new Camioneta("Mercedes","Gris", 450F);
		//Camioneta camioneta = new Camioneta();
		Camioneta camioneta = new Camioneta("2000k",2000F);
		//camioneta.setsTara("1000k");
		System.out.println("***************");
		
		System.out.println("Ingrese la tara");
		String sTara = scan.next();
		System.out.println("Ingrese color");
		String sColor = scan.next();
	
		camioneta.setsColor(sColor);
		camioneta.setsTara(sTara);
		System.out.println(camioneta.getsTara());
		System.out.println(camioneta.getsColor());
		
	}

}
