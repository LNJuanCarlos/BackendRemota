package prueba.remota.dto;

import java.util.Date;

public class CertificadoMantenimientoDto {

	    private String nombreEmpresa;
	    private Date fecha;
	    private String cliente;
	    private String descripcionMarca;
	    private String modelo;
	    private String color;
	    private String numeroPlaca;
	    private Integer maquinaKilometraje;
	    private String maquinaHoraKilometraje;

	    public CertificadoMantenimientoDto(String nombreEmpresa, Date fecha, String cliente,
	                                       String descripcionMarca, String modelo, String color,
	                                       String numeroPlaca, Integer maquinaKilometraje,
	                                       String maquinaHoraKilometraje) {
	        this.nombreEmpresa = nombreEmpresa;
	        this.fecha = fecha;
	        this.cliente = cliente;
	        this.descripcionMarca = descripcionMarca;
	        this.modelo = modelo;
	        this.color = color;
	        this.numeroPlaca = numeroPlaca;
	        this.maquinaKilometraje = maquinaKilometraje;
	        this.maquinaHoraKilometraje = maquinaHoraKilometraje;
	    }

		public String getNombreEmpresa() {
			return nombreEmpresa;
		}

		public void setNombreEmpresa(String nombreEmpresa) {
			this.nombreEmpresa = nombreEmpresa;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		public String getCliente() {
			return cliente;
		}

		public void setCliente(String cliente) {
			this.cliente = cliente;
		}

		public String getDescripcionMarca() {
			return descripcionMarca;
		}

		public void setDescripcionMarca(String descripcionMarca) {
			this.descripcionMarca = descripcionMarca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getNumeroPlaca() {
			return numeroPlaca;
		}

		public void setNumeroPlaca(String numeroPlaca) {
			this.numeroPlaca = numeroPlaca;
		}

		public Integer getMaquinaKilometraje() {
			return maquinaKilometraje;
		}

		public void setMaquinaKilometraje(Integer maquinaKilometraje) {
			this.maquinaKilometraje = maquinaKilometraje;
		}

		public String getMaquinaHoraKilometraje() {
			return maquinaHoraKilometraje;
		}

		public void setMaquinaHoraKilometraje(String maquinaHoraKilometraje) {
			this.maquinaHoraKilometraje = maquinaHoraKilometraje;
		}
	    
	    
    
    

}
