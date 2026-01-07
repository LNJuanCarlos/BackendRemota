package prueba.remota.dto;

public class CertificadoMantenimientoDetalleDto {

	private String descripcionActividad;

    public CertificadoMantenimientoDetalleDto() {}

    public CertificadoMantenimientoDetalleDto(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }
}