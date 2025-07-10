package prueba.remota.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import prueba.remota.dto.CertificadoMantenimientoDto;

@Repository
public class CertificadoMantenimientoDaoImpl implements CertificadoMantenimientoDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<CertificadoMantenimientoDto> obtenerPorCompaniaYNumeroDoc(String CompaniaSocio, int numeroDoc) {
        StoredProcedureQuery query = em.createNamedStoredProcedureQuery("CertificadoMantenimiento.obtenerCertificado");
        query.setParameter("CompaniaSocio", CompaniaSocio);
        query.setParameter("numerodoc", numeroDoc);
        return query.getResultList();
    }
}