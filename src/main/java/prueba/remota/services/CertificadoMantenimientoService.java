package prueba.remota.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.remota.dao.CertificadoMantenimientoDao;
import prueba.remota.dto.CertificadoMantenimientoDto;

@Service
public class CertificadoMantenimientoService {

    @Autowired
    private CertificadoMantenimientoDao dao;

    public List<CertificadoMantenimientoDto> obtener(String CompaniaSocio, int numeroDoc) {
        return dao.obtenerPorCompaniaYNumeroDoc(CompaniaSocio, numeroDoc);
    }
}
