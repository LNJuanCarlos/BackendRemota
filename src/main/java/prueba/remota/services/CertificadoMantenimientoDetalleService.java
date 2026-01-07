package prueba.remota.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.remota.dao.CertificadoMantenimientoDetalleDao;
import prueba.remota.dto.CertificadoMantenimientoDetalleDto;

@Service
public class CertificadoMantenimientoDetalleService {

    @Autowired
    private CertificadoMantenimientoDetalleDao dao;

    public List<CertificadoMantenimientoDetalleDto> obtenerDetalle(String compania, int numeroDoc) {
        return dao.obtenerDetalle(compania, numeroDoc);
    }
}
