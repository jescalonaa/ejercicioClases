package com.aiep.a20200610;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.aiep.a20200610.bd.BaseDatos;
import com.aiep.a20200610.controller.ArquitecturaController;

public class MainDB {

	public static void main(String[] args) {
		
		//creamos la conexion,statement y resultset y realizamos el import 
		Connection con = null;
		Statement stmt = null;
		ResultSet resul = null;
		
		//instacia de base datos
		BaseDatos basedato =new BaseDatos();
		
		//Instancia del controller
		//ArquitecturaController ac = new ArquitecturaController();

		//seteamos los datps
		basedato.setsUsuario("Alexis");
		basedato.setiPuerto(3307);
		basedato.setsServidor("127.0.0.1");
		basedato.setsBaseDatos("arquitectura");
		
		//creamos el statment
		
		try {
			con = basedato.conectar();
			stmt= con.createStatement();
			resul = stmt.executeQuery("SELECT * FROM cursos");
			
			//crear tablas cursos y alumnos
		
			/* cursos
			 * id
			 * nombre
			 * codigo
			 */
			while(resul.next()) {
				//recorremos el resul y 
				//accedemos a los registros por posicion
				int iCursoId = resul.getInt(1);
				String sNombreCurso = resul.getString(2);
				String sCodigoCurso = resul.getString(3);
				
				//cada vez que encuentre un registro lo imprimirá
				System.out.println("Curso Id "+ iCursoId);
				System.out.println("Nombre Curso "+ sNombreCurso);
				System.out.println("Codigo Curso "+ sCodigoCurso);
			}
			
			/*alumnos
			 * id
			 * nombre
			 * apellido
			 * edad
			 */
			
		} catch (SQLException e) {
			System.out.println("Error al realizar la consulta "+ e);
		}finally {
			//cerramos las conexiones 
			try {
				if(resul != null ) {
					resul.close();
				}
				if(stmt != null ) {
					stmt.close();
				}
				if(con != null ) {
					con.close();
				}
					
			} catch (Exception e2) {
				System.out.println("Error al cerrar la conexiones "+ e2);
			}
		}

	}

}
