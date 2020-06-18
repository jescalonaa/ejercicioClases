package com.aiep.a20200610.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatos {
	
	private String sServidor = "localhost";
	private String sUsuario = "israel";//root
	private String sPassword = "******";
	private int iPuerto = 3306;
	private String sServer = "";
	private String sBaseDatos = "";
	
	private static Connection conexion = null;

	public Connection conectar() {
		
		//al igual que el anterior metodo, realizo la conexion
		try {
			conexion = DriverManager.getConnection(this.sServer,this.sUsuario,this.sPassword);
		} catch (SQLException e) {
			//e.printStackTrace();
			System.err.println("Error al conectar a Mysql: "+e);
			// Al detectar error termina el flujo
			System.exit(0);
		}
		//retorno la conexion
		return conexion;
	}
	
	//lo utilizaremos a priori
	/*
	public BaseDatos() {
		super();
	}
*/
	public BaseDatos() {
		//public BaseDatos(String sBaseDatos) {
		//recibimos el nombre de la base de datos
		
		this.sServer = "jdbc:mysql://"+this.sServidor+":"+
						this.iPuerto+"/"+sBaseDatos;
		//jdbc:mysql://localhost:3306/arquitectura
		
		//registremos el driver mysql
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.err.println("Error al registrar el driver Mysql: "+e);
			// Al detectar error termina el flujo
			System.exit(0);
		}
		
		//conexion a mysql establecida
		
		try {
			conexion = DriverManager.getConnection(this.sServer,this.sUsuario,this.sPassword);
		} catch (SQLException e) {
			//e.printStackTrace();
			System.err.println("Error al conectar a Mysql: "+e);
			// Al detectar error termina el flujo
			System.exit(0);
		}
		System.out.println("No hemos conectado a la base de datos: "+ sBaseDatos);
		
	}

	public String getsServidor() {
		return sServidor;
	}

	public void setsServidor(String sServidor) {
		this.sServidor = sServidor;
	}

	public String getsUsuario() {
		return sUsuario;
	}

	public void setsUsuario(String sUsuario) {
		this.sUsuario = sUsuario;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public int getiPuerto() {
		return iPuerto;
	}

	public void setiPuerto(int iPuerto) {
		this.iPuerto = iPuerto;
	}

	public String getsBaseDatos() {
		return sBaseDatos;
	}

	public void setsBaseDatos(String sBaseDatos) {
		this.sBaseDatos = sBaseDatos;
	}
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/arquitectura","israel","secret");
			System.out.println("conexión ok");
		} catch (Exception e) {
			System.out.println("Error de conexión");
		}
	}

}
