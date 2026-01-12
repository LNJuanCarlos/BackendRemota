package prueba.remota.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.ConstructorResult;
import javax.persistence.ColumnResult;

@Entity
@SqlResultSetMapping(
	    name = "PagoProveedorMapping",
	    classes = @ConstructorResult(
	        targetClass = PagoProveedorDto.class,
	        columns = {
	            @ColumnResult(name="NombreProveedor"),
	            @ColumnResult(name="Tipocomprobante"),
	            @ColumnResult(name="NroDocumento"),
	            @ColumnResult(name="SituacionDocumento"),
	            @ColumnResult(name="TipoPago"),
	            @ColumnResult(name="LugarPago"),
	            @ColumnResult(name="FechaRegistro", type=java.util.Date.class),
	            @ColumnResult(name="FechaDocumento", type=java.util.Date.class),
	            @ColumnResult(name="FechaPago", type=java.util.Date.class),
	            @ColumnResult(name="FechaVencimiento", type=java.util.Date.class),
	            @ColumnResult(name="Certificadoretencion")
	        }
	    )
	)



public class PagoProveedorDto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String nroDocumento;
	private String nombreProveedor;
    private String tipoComprobante;
    private String situacionDocumento;
    private String tipoPago;
    private String lugarPago;
    private Date fechaRegistro;
    private Date fechaDocumento;
    private Date fechaPago;
    private Date fechaVencimiento;
    private String certificadoRetencion;
    
    public PagoProveedorDto() {}
    
    public PagoProveedorDto(
    	    String nombreProveedor,
    	    String tipoComprobante,
    	    String nroDocumento,
    	    String situacionDocumento,
    	    String tipoPago,
    	    String lugarPago,
    	    Date fechaRegistro,
    	    Date fechaDocumento,
    	    Date fechaPago,
    	    Date fechaVencimiento,
    	    String certificadoRetencion
    	) {
    	    this.nombreProveedor = nombreProveedor;
    	    this.tipoComprobante = tipoComprobante;
    	    this.nroDocumento = nroDocumento;
    	    this.situacionDocumento = situacionDocumento;
    	    this.tipoPago = tipoPago;
    	    this.lugarPago = lugarPago;
    	    this.fechaRegistro = fechaRegistro;
    	    this.fechaDocumento = fechaDocumento;
    	    this.fechaPago = fechaPago;
    	    this.fechaVencimiento = fechaVencimiento;
    	    this.certificadoRetencion = certificadoRetencion;
    	}
    
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public String getTipoComprobante() {
		return tipoComprobante;
	}
	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getSituacionDocumento() {
		return situacionDocumento;
	}
	public void setSituacionDocumento(String situacionDocumento) {
		this.situacionDocumento = situacionDocumento;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	public String getLugarPago() {
		return lugarPago;
	}
	public void setLugarPago(String lugarPago) {
		this.lugarPago = lugarPago;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Date getFechaDocumento() {
		return fechaDocumento;
	}
	public void setFechaDocumento(Date fechaDocumento) {
		this.fechaDocumento = fechaDocumento;
	}
	public Date getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getCertificadoRetencion() {
		return certificadoRetencion;
	}
	public void setCertificadoRetencion(String certificadoRetencion) {
		this.certificadoRetencion = certificadoRetencion;
	}

	
    
}
