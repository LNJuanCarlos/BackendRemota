package prueba.remota.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import prueba.remota.dto.CertificadoMantenimientoDto;


@Repository
public class CertificadoMantenimientoDao {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
	public List<CertificadoMantenimientoDto> obtenerCertificado(String compania, int numeroDoc) {
        Query query = em.createNativeQuery("EXEC sp_cr_listacab_web :compania, :numeroDoc", "CertificadoMantenimientoMapping");
        query.setParameter("compania", compania);
        query.setParameter("numeroDoc", numeroDoc);

        return query.getResultList();
    }
}
