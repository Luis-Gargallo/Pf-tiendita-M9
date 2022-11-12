package mx.diplomado.luis.tienda.repositories;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import mx.diplomado.luis.tienda.beans.Venta;

@Named
@SessionScoped
public class Ventas implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<VentaEntity> ventas;
	
	public Ventas() {
		ventas = new ArrayList<>();
	}
	
	 public void agregar(Venta venta){
	        VentaEntity ve = new VentaEntity();
	        ve.setCantidad(venta.getCantidad());
	        ve.setFechaVenta(venta.getFechaVenta());
	        ve.setIdVenta(venta.getIdVenta());
	        ve.setTotal(venta.getTotal());
	        ventas.add(ve);
	    }

	    public List<VentaEntity> getVentas() {
	        return ventas;
	    }
}
