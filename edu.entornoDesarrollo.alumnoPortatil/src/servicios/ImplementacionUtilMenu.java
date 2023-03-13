package servicios;

/**
 * Implementación de la interfaz de utilidades del menú
 * @author garfe
 *
 */
public class ImplementacionUtilMenu implements InterfazUtilMenu {

	@Override
	public void mostrarMenu() {
		System.out.print("1. Matrícula alumno");
		System.out.print("2. Baja alumno");
		System.out.print("3. Listar alumnos");
		System.out.print("4. Salir");
	}

}
