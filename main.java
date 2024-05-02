package com.umg.test;

import java.util.Scanner;

//import java.util.Scanner;

import com.umg.dao.TestDao;

public class Main {

	public static void main(String[] args) {
		
		//Ingresar datos de forma manual 
		//TestDao.estudiante("Santos", "Irene", "Santiago", "Lopez", "femenino", "205-02-02", "51306497", "2585306690103", "600.00", "lsilva");
		//Solicitar ingresar los datos de los estudiantes
		System.out.println("Ingresa los datos solicitados: Primer Nombre, Segundo Nombre, Primer Apellido, Segundo Apellido, Genero, Fecha de Nacimiento, Numero de Telefono, DPI, Precio Colegiatura, Usuario que Ingresa los datos, Debes presionar enter cuando ingreses cada uno de los datos:"); 
		Scanner scanner = new Scanner(System.in);
		
		 TestDao.estudiante(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
	         //TestDao.eliminarEstudiante(1);
		 //TestDao.actualizarEstudiante();
	         //TestDao.leerEstudiantes();
	}

}
