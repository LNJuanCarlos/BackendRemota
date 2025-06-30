package prueba.remota.dto;

import java.io.Serializable;

public class OrdenTrabajoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idOt;
    private String codigoProducto;
    private String nombreProducto;
    private int cantidadSolicitada;
    private int cantidadEnStock;
    private String comentario;

    // Constructor vacío
    public OrdenTrabajoDetalle() {}

    // Constructor con todos los campos
    public OrdenTrabajoDetalle(String idOt, String codigoProducto, String nombreProducto, int cantidadSolicitada, int cantidadEnStock, String comentario) {
        this.idOt = idOt;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadSolicitada = cantidadSolicitada;
        this.cantidadEnStock = cantidadEnStock;
        this.comentario = comentario;
    }

    // Getters y setters
    public String getIdOt() {
        return idOt;
    }

    public void setIdOt(String idOt) {
        this.idOt = idOt;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(int cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}