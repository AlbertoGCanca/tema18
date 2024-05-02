package practica18.models;

public class Calificacion {

	public Alumno alumno;
	public int nota;
	public boolean recuperacion;

	public Calificacion(Alumno alumno, int nota, boolean recuperacion) {
		super();
		this.alumno = alumno;
		this.nota = nota;
		this.recuperacion = recuperacion;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public boolean isRecuperacion() {
		return recuperacion;
	}

	public void setRecuperacion(boolean recuperacion) {
		this.recuperacion = recuperacion;
	}

}
