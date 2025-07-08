package prueba.remota.dao;

import org.springframework.stereotype.Repository;

import prueba.remota.dto.CertificadoMantenimientoDto;

@Repository
public interface CertificadoMantenimientoDao {
	
	CertificadoMantenimientoDto obtenerPorOrden(String ordenTrabajo);

}
