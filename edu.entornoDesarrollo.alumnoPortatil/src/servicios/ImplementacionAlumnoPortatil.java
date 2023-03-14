package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.RelacionAlumnoPortatil;

public class ImplementacionAlumnoPortatil implements InterfazAlumnoPortatil {

	@Override
	public void matriculaAlumno(List<RelacionAlumnoPortatil> listaAntigua) {
		RelacionAlumnoPortatil nuevaMatricula = new RelacionAlumnoPortatil();
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dime el nombre: ");
		nuevaMatricula.setNombreAlumno(entrada.next());
		System.out.print("Dime los apellidos: ");
		nuevaMatricula.setApellidosAlumno(entrada.next());
		System.out.print("Dime el teléfono: ");
		nuevaMatricula.setTlfAlumno(entrada.next());
		System.out.print("Dime la marca del portátil: ");
		nuevaMatricula.setMarcaPortatil(entrada.next());
		System.out.print("Dime el modelo del portátil: ");
		nuevaMatricula.setModeloPortatil(entrada.next());
		nuevaMatricula.setIdentificadorPortatil(concatenacionMarcaModelo(nuevaMatricula.getMarcaPortatil(),nuevaMatricula.getModeloPortatil()));
		nuevaMatricula.setIdentificadorAlumno(calculoIdAlumno(listaAntigua));		
		listaAntigua.add(nuevaMatricula);
	}
	
	/**
	 * Cálculo del nuevo id de alumno
	 * @param listaAntigua
	 * @return nuevo id alumno
	 */
	private int calculoIdAlumno(List<RelacionAlumnoPortatil> listaAntigua) {
		int auxiliar = 0;
		for(int i = 0; i< listaAntigua.size(); i++) {
			int j = listaAntigua.get(i).getIdentificadorAlumno();
			if(auxiliar<j) {
				auxiliar = j;
			}
		}
		return auxiliar + 1;
	}
	
	/**
	 * Concatenación entre la marca y el modelo
	 * @param marca
	 * @param modelo
	 * @return String con la concatenación
	 */
	private String concatenacionMarcaModelo(String marca, String modelo) {
		String idPortatil;
		if(marca.length()<3) {
			idPortatil = marca;
		}else {
			idPortatil = marca.substring(0,3);
		}
		idPortatil += "-";
		if(marca.length()<3) {
			idPortatil += modelo;
		}else {
			idPortatil += modelo.substring(0,3);
		}
		return idPortatil;
	}

	@Override
	public void borrarAlumno(List<RelacionAlumnoPortatil> listaAntigua) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dime el id del alumno a borrar: ");
		int idAlumnoBorrar = entrada.nextInt();		
		RelacionAlumnoPortatil aBorrar = null;		
		for(RelacionAlumnoPortatil alumno: listaAntigua) {
			if(alumno.getIdentificadorAlumno() == idAlumnoBorrar) {
				aBorrar = alumno; //paso por valor o paso por referencia
			}			
		}		
		listaAntigua.remove(aBorrar);		
	}

	@Override
	public void listarAlumnos(List<RelacionAlumnoPortatil> listaAlumnos) {
		
		for(RelacionAlumnoPortatil alumno: listaAlumnos) {
			System.out.print(alumno.toString() + "\n");
		}

	}

}
