package com.aiep.a20200603;

public class Main {

	public static void main(String[] args) {
		
		//instancia del objetozvxcbnmfg,h.,mhngfdsasd
		
		Robot robot= new Robot(); 
		robot.setNombre("");
		robot.obtenerNombreRobot();

		//array de objetos
	 //posiciones del arreglo[3]= 0,1,2
 		Robot  arrayRobot[] = new Robot[3];//[robot,robot,robot]
		
 		arrayRobot[0]= new Robot();//nueva instancia
 		arrayRobot[1]= new Robot("Wally");//nueva instancia
 		arrayRobot[2]= new Robot("Optimus",5000.6);//nueva instancia
 		
 		System.out.println("*********************");
 		arrayRobot[0].obtenerNombreRobot();
 		
 		System.out.println("*********************");
		for (int i = 0; i < 3; i++) {
			
			if(i==2) {
				arrayRobot[i].setfdPeso(7000.6);
				arrayRobot[i].obtenerNombreRobot();
			}else {
				arrayRobot[i].obtenerNombreRobot();
			}
		}
 		
		
		String arreglo[] = new String[3];
		
		//Como crear un arreglo de arreglo
	}


}
