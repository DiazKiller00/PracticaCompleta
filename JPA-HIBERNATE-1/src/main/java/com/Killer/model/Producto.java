package com.Killer.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idproducto;

	@Column(name="cantidad_producto")
	private int cantidadProducto;

	@Column(name="nombre_producto")
	private String nombreProducto;

	@Column(name="precio_producto")
	private double precioProducto;

	@Column(name="total_produto")
	private double totalProduto;

	public Producto() {
	}

	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public int getCantidadProducto() {
		return this.cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioProducto() {
		return this.precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getTotalProduto() {
		return this.totalProduto;
	}

	public void setTotalProduto(double totalProduto) {
		this.totalProduto = totalProduto;
	}

	@Override
	public String toString() {
		return "Producto [idproducto=" + idproducto + ", cantidadProducto=" + cantidadProducto + ", nombreProducto="
				+ nombreProducto + ", precioProducto=" + precioProducto + ", totalProduto=" + totalProduto + "]";
	}
	

}