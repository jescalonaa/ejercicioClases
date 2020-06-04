package com.aiep.a20200530;

import java.util.Scanner;

public class Matematica {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el cateto a");
		double dCatetoA = scan.nextDouble();
		System.out.println("Ingrese el cateto b");
		double dCatetoB = scan.nextDouble();
		double hipotenusa = calcularHipotenusa(dCatetoA,dCatetoB);
		
		System.out.println("El valor de la hipotenusa es "+ hipotenusa );
		
		scan.close();
	}
	
	public static double calcularHipotenusa(double iCatetoA, double iCatetoB) {
		double dCatetoC = Math.hypot(iCatetoA, iCatetoB);
		return dCatetoC;
	}
	
	//funcion que no retorna parametros, no recibe parametros
	public static void metodo1() {
		
	}
	//funcion que no retorna parametros, recibe parametro de tipo int, etc
	public void metodo2(int iNumero, String variable) {
		
	}
	
	//funcion que retorna parametros, no recibe parametros
	public static int metodo3() {
		return 0;
	
	}
	
	//funcion que retorna parametros, recibe parametros
	public static int metodo4(int iNumero1, int iNumero2) {
		return 0;
	}
	
}
