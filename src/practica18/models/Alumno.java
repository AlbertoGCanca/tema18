package practica18.models;

public class Alumno {

	public String nombre;
	public int codigo;

	public Alumno(String nombre, int codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
