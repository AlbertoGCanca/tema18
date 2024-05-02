package practica18.models;

public class Producto {

	public String nombre;
	public String descripcion;
	public String categoria;
	public int stock;
	public double precio;
	public int codigo;
	public Boolean esPremium;

	public Producto(String nombre, String descripcion, String categoria, int stock, double precio, int codigo,
			Boolean esPremium) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.stock = stock;
		this.precio = precio;
		this.codigo = codigo;
		this.esPremium = esPremium;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Boolean isEsPremium() {
		return esPremium;
	}

	public void setEsPremium(Boolean esPremium) {
		this.esPremium = esPremium;
	}
}
