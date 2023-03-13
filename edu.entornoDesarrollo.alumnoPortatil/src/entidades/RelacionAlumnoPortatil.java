package entidades;

/**
 * Paso1. Entidad que se utiliza para representar la información de registro de asignación de portátiles.
 * @author garfe
 *
 */
public class RelacionAlumnoPortatil {

	//Atributos
	private int identificadorAlumno = 0;
	private String nombreAlumno = "aaaaa";
	private String apellidosAlumno = "aaaaa";
	private String tlfAlumno ="aaaaa";
	private String identificadorPortatil ="aaaaa";
	private String marcaPortatil ="aaaaa";
	private	String modeloPortatil ="aaaaa";
	
	//Getters y Setters
	
	public int getIdentificadorAlumno() {
		return identificadorAlumno;
	}
	public void setIdentificadorAlumno(int identificadorAlumno) {
		this.identificadorAlumno = identificadorAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getApellidosAlumno() {
		return apellidosAlumno;
	}
	public void setApellidosAlumno(String apellidosAlumno) {
		this.apellidosAlumno = apellidosAlumno;
	}
	public String getTlfAlumno() {
		return tlfAlumno;
	}
	public void setTlfAlumno(String tlfAlumno) {
		this.tlfAlumno = tlfAlumno;
	}
	public String getIdentificadorPortatil() {
		return identificadorPortatil;
	}
	public void setIdentificadorPortatil(String identificadorPortatil) {
		this.identificadorPortatil = identificadorPortatil;
	}
	
	  public String getMarcaPortatil() { return marcaPortatil; }
	 	
	public void setMarcaPortatil(String marcaPortatil) {
		this.marcaPortatil = marcaPortatil;
	}
	
	  public String getModeloPortatil() { return modeloPortatil; }
	 
	public void setModeloPortatil(String modeloPortatil) {
		this.modeloPortatil = modeloPortatil;
	}
	
	//Constructores
	public RelacionAlumnoPortatil(int identificadorAlumno, String nombreAlumno, String apellidosAlumno,
			String tlfAlumno, String identificadorPortatil, String marcaPortatil, String modeloPortatil) {
		super();
		this.identificadorAlumno = identificadorAlumno;
		this.nombreAlumno = nombreAlumno;
		this.apellidosAlumno = apellidosAlumno;
		this.tlfAlumno = tlfAlumno;
		this.identificadorPortatil = identificadorPortatil;
		this.marcaPortatil = marcaPortatil;
		this.modeloPortatil = modeloPortatil;
	}
	
	public RelacionAlumnoPortatil() {
		super();
	}
	
	//toString
	@Override
	public String toString() {
		return "RelacionAlumnoPortatil [identificadorAlumno=" + identificadorAlumno + ", nombreAlumno=" + nombreAlumno
				+ ", apellidosAlumno=" + apellidosAlumno + ", tlfAlumno=" + tlfAlumno + ", identificadorPortatil="
				+ identificadorPortatil + ", marcaPortatil=" + marcaPortatil + ", modeloPortatil=" + modeloPortatil
				+ "]";
	}		
	
}
