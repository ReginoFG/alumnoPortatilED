package servicios;

import java.util.List;

import entidades.RelacionAlumnoPortatil;

/**
 * Paso 3. Lógica/funcionalidad de aplicación
 * @author garfe
 *
 */
public interface InterfazAlumnoPortatil {

	/**
	 * Matricular alumno
	 * @param listaAntigua lista que se va a actualizar con la nueva matrícula
	 * @return listaNueva lista actualizada
	 */
	public void matriculaAlumno(List<RelacionAlumnoPortatil> listaAntigua);

	/**
	 * Borrar alumno
	 * @param listaAntigua lista que se va a actualizar con el borrado de un objeto
	 * @return listaNueva lista actualizada
	 */
	public void borrarAlumno(List<RelacionAlumnoPortatil> listaAntigua);
	
	/**
	 * Listar en consola los alumnos existentes
	 * @param listaAlumnos
	 */
	public void listarAlumnos(List<RelacionAlumnoPortatil> listaAlumnos);
}
