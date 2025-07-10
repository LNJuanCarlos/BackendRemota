package prueba.remota.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import prueba.remota.dto.CertificadoMantenimientoDto;


public interface CertificadoMantenimientoDao {
    List<CertificadoMantenimientoDto> obtenerPorCompaniaYNumeroDoc(String CompaniaSocio, int numeroDoc);
}
