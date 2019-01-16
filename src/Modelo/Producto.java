package Modelo;

public class Producto {

	public String id;
	public String nombre;
	public String descripcion;
        public Usuario user;
	public float precioc;
	public float preciop;
	public int cantidad;
        public int estado;
    
        public int getEstado() {
            return estado;
        }

        public void setEstado(int estado) {
            this.estado = estado;
        }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public float getPrecioc() {
		return precioc;
	}
	public void setPrecioc(float precioc) {
		this.precioc = precioc;
	}
	public float getPreciop() {
		return preciop;
	}
	public void setPreciop(float preciop) {
		this.preciop = preciop;
	}
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
