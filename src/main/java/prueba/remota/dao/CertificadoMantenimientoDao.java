package prueba.remota.dao;

import prueba.remota.dto.CertificadoMantenimientoDto;

public interface CertificadoMantenimientoDao {
	
	CertificadoMantenimientoDto obtenerPorOrden(String ordenTrabajo);

}
