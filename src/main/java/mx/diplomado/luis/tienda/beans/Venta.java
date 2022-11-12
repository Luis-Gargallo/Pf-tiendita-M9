package mx.diplomado.luis.tienda.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Named;
import mx.diplomado.luis.tienda.repositories.VentaEntity;
import mx.diplomado.luis.tienda.repositories.Ventas;

@Named
@SessionScoped
public class Venta implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idVenta;
	private Integer total;
	private Integer cantidad;
	private String fechaVenta;
	private Ventas ventas;
	
	public Venta() {
		ventas = new Ventas();
	}
	public List<VentaEntity> getVentas(){
		return ventas.getVentas();
	}
	
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
		return "Venta [idVenta=" + idVenta + ", total=" + total + ", cantidad=" + cantidad + ", fechaVenta="
				+ fechaVenta + "]";
	}
	public void vnt(AjaxBehaviorEvent event) throws AbortProcessingException {
        ventas.agregar(this);

        System.out.println(ventas.getVentas().size());
        for (VentaEntity entity : ventas.getVentas()) {
            System.out.println(entity);
        } 
    }
	
}
