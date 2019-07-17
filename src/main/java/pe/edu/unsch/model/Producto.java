package pe.edu.unsch.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="producto")
public class Producto implements Serializable{

private static final long serialVersionUID = 1L;
	
	private int id_producto;
	private String nombre;
	private String descripcion;
	private double precio;
	
	
	private List<Detalle_Pedido> detalle_pedido;
	
	public Producto() {
		this.detalle_pedido= new ArrayList<>();
	}


	@Id
	@Column(name="id_producto",unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_producto() {
		return id_producto;
	}


	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}


	@Column(name="nombre",length=50)
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Column(name="descripcion",length=600)
	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}







	@Column(name="precio",nullable = false, scale = 2)
	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@JsonIgnoreProperties(value={"producto","hibernateLazyInitializer","handler"}, allowSetters=true)
	@OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
	public List<Detalle_Pedido> getDetalle_pedido() {
		return detalle_pedido;
	}


	public void setDetalle_pedido(List<Detalle_Pedido> detalle_pedido) {
		this.detalle_pedido = detalle_pedido;
	}
}
