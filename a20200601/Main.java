package com.aiep.a20200601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Vehiculo vehiculo = new Vehiculo();
		
		Camioneta camioneta1 = new Camioneta();
		Camioneta camioneta2 = new Camioneta("sdfg32","ja213","Rojo","Huindai");
		Camioneta camioneta3 = new Camioneta(3242,12424);

		Deportivo deportivo1 = new Deportivo();
		Deportivo deportivo2 = new Deportivo("qqfq44","kjhg22","Negro", "Mercedes");
		
		Urbano urbano = new Urbano();
		
		
		
		//Camioneta camioneta4 = new Vehiculo();
		
		//Polimorfismo
		Vehiculo vehiculo2 = new Camioneta();
		Vehiculo vehiculo3 = new Deportivo();
		Vehiculo vehiculo4 = new Urbano();

		
		System.out.println("ingrese datos de matricula");
		String sMatricula = sc.next();
		urbano.setsMatricula(sMatricula);
		
		
		System.out.println(urbano.getsMatricula());
		
	}

}
