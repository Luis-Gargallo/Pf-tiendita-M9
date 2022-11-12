package mx.diplomado.luis.tienda.repositories;

import java.io.Serializable;
import java.util.Date;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class VentaEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer idVenta;
	private Integer total;
	private Integer cantidad;
	private String fechaVenta;
	public Integer getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	@Override
	public String toString() {
		return "VentaEntity [idVenta=" + idVenta + ", total=" + total + ", cantidad=" + cantidad + ", fechaVenta="
				+ fechaVenta + "]";
	}
	
	
}
