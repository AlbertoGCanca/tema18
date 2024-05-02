package practica18;

import com.db4o.ObjectSet;

import practica18.controllers.ConexionDB4O;
import practica18.exceptions.DB4OException;
import practica18.models.Producto;

public class Main {

	public static void main(String[] args) throws DB4OException {
		ConexionDB4O connect = new ConexionDB4O("midatabase.db4o");
		connect.connect();

		// Inserción
//		Alumno alumno1 = new Alumno("Alberto", 45);
//		connect.insert(alumno1);
//		Alumno alumno2 = new Alumno("Pedro", 789);
//		connect.insert(alumno2);
//		Alumno alumno3 = new Alumno("María", 4545);
//		connect.insert(alumno3);

//		// Consulta Alumnos
//		ObjectSet<Object> res1 = connect.read(new Alumno(null, 0));
//		while (res1.hasNext()) {
//			Alumno alumno = (Alumno) res1.next();
//			connect.delete(alumno);
//			System.out.println(alumno.getNombre());
//		}

		// Consulta calificaiones
//		ObjectSet<Object> resCals = connect.read(new Calificacion(null, 0, false));
//		while (resCals.hasNext()) {
//			Calificacion cali = (Calificacion) resCals.next();
//			System.out.println(cali.getAlumno().getNombre());
//		}

//		Producto p1 = new Producto("Bolígrafo", "Con capuchón", "Papelería", 45, 1.25, 56989, true);
//		connect.insert(p1);
//
//		Producto p2 = new Producto("Lápiz", "Básico", "Papelería", 125, 0.25, 968574, false);
//		connect.insert(p2);
//
//		Producto p3 = new Producto("Borrador", "Básiquillo", "Papelería", 56, 0.15, 125, false);
//		connect.insert(p3);
//
//		Producto p4 = new Producto("Rotulador", "De color rojo", "Papelería", 256, 0.65, 8945123, null);
//		connect.insert(p4);

		// Consulta de productos
//		Producto plantilla = new Producto(null, null, null, 0, 0.0, 0, null);
//		ObjectSet<Object> resProds = connect.read(plantilla);
//		while (resProds.hasNext()) {
//			Producto p = (Producto) resProds.next();
//			System.out.println(p.getNombre());
//		}

		ObjectSet<Object> resProds = connect.productoByPrecioAndStock(0.5, 100);
		while (resProds.hasNext()) {
			Producto p = (Producto) resProds.next();
			System.out.println(p.getNombre());
		}

		connect.disconnect();
	}

}
