package practica18.controllers;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseFileLockedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import com.db4o.ext.IncompatibleFileFormatException;
import com.db4o.ext.OldFormatException;
import com.db4o.query.Constraint;
import com.db4o.query.Query;

import practica18.exceptions.DB4OException;
import practica18.models.Producto;

public class ConexionDB4O {

	private String rutabd;
	private ObjectContainer bd;

	public ConexionDB4O(String rutabd) {
		this.bd = null;
		this.rutabd = rutabd;
	}

	public void connect() throws DB4OException {
		try {
			bd = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), rutabd);
		} catch (Db4oIOException | DatabaseFileLockedException | IncompatibleFileFormatException | OldFormatException
				| DatabaseReadOnlyException error) {
			throw new DB4OException(error.toString());
		}
	}

	public void disconnect() throws DB4OException {
		try {
			bd.close();
		} catch (Db4oIOException e) {
			throw new DB4OException(e.toString());
		}
	}

	public void insert(Object o) {
		bd.store(o);
	}

	public ObjectSet<Object> read(Object o) {
		ObjectSet<Object> res = bd.queryByExample(o);
		return res;
	}

	public void delete(Object o) {
		bd.delete(o);
	}

	public ObjectSet<Object> productoByStock(int stockToFilter) {
		Query query = bd.query();
		query.constrain(Producto.class);
		Constraint c = query.descend("stock").constrain(stockToFilter).greater();
		ObjectSet<Object> res = query.execute();
		return res;
	}

	public ObjectSet<Object> productoByPrecio(double precioToFilter) {
		Query query = bd.query();
		query.constrain(Producto.class);
		Constraint c = query.descend("precio").constrain(precioToFilter).greater();
		query.descend("nombre").orderAscending();
		ObjectSet<Object> res = query.execute();
		return res;
	}

	public ObjectSet<Object> productoByPrecioAndStock(double precioToFilter, int stockToFilter) {
		Query query = bd.query();
		query.constrain(Producto.class);
		Constraint c = query.descend("precio").constrain(precioToFilter).greater();
		query.descend("stock").constrain(stockToFilter).greater().or(c);
		query.descend("nombre").orderAscending();
		ObjectSet<Object> res = query.execute();
		return res;
	}

}
