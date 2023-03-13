package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.RelacionAlumnoPortatil;
import servicios.ImplementacionAlumnoPortatil;
import servicios.ImplementacionUtilMenu;
import servicios.InterfazAlumnoPortatil;
import servicios.InterfazUtilMenu;

/**
 * Menú principal de nuestra aplicación
 * @author garfe
 *
 */
public class ControladorMenu {

	public static void main(String[] args) {
		//Paso 2. Verificar que sé utilizar las entidades
		// - Instanciar la entidad y crear un listado con esa entidad
		// - Trabajar con el listado
		
		RelacionAlumnoPortatil alumnoPortatil = new RelacionAlumnoPortatil();
		List<RelacionAlumnoPortatil> listaRelacionAlumnoPortatil = new ArrayList<RelacionAlumnoPortatil>();
		
		/* Paso 2.
		 * RelacionAlumnoPortatil pruebaAlumnoPortatil = new RelacionAlumnoPortatil( 1,
		 * "Regino", "Fernández", "999888777", "len-pad", "lenovo", "ideapad" );
		 * listaRelacionAlumnoPortatil.add(pruebaAlumnoPortatil);
		 * 
		 * for(RelacionAlumnoPortatil cajaAlumnoPortatil: listaRelacionAlumnoPortatil) {
		 * System.out.print(cajaAlumnoPortatil.toString()); } for(RelacionAlumnoPortatil
		 * cajaAlumnoPortatil: listaRelacionAlumnoPortatil) {
		 * if(cajaAlumnoPortatil.getIdentificadorAlumno() == 1) {
		 * listaRelacionAlumnoPortatil.remove(cajaAlumnoPortatil);
		 * if(listaRelacionAlumnoPortatil.size()<=0) { break; } } }
		 * for(RelacionAlumnoPortatil cajaAlumnoPortatil: listaRelacionAlumnoPortatil) {
		 * System.out.print(cajaAlumnoPortatil.toString()); }
		 */
		
		//Paso 3. Crear Menú
		// - Interfaz funcionalidad
		// - switch case
		InterfazUtilMenu ium = new ImplementacionUtilMenu();
		InterfazAlumnoPortatil iap = new ImplementacionAlumnoPortatil();

		Scanner entradaOpcion = new Scanner(System.in);		
		Boolean cerrarMenu = false;
		int opcion;
		while(!cerrarMenu) {	
			//Mostramos el menú
			ium.mostrarMenu();
			System.out.println("Introduza la opción deseada: ");
			opcion = entradaOpcion.nextInt();
			System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
			
			switch (opcion) {			
				case 1: //Matricula
					listaRelacionAlumnoPortatil = iap.matriculaAlumno(listaRelacionAlumnoPortatil);					
					break;
				case 2: //Borrar
					listaRelacionAlumnoPortatil = iap.borrarAlumno(listaRelacionAlumnoPortatil);			
					break;
				case 3: //Listar alumnos
					iap.listarAlumnos(listaRelacionAlumnoPortatil);
					break;
				case 4:
					cerrarMenu = true;
					break;
				default:

			}
		}
		
	}
}
