package prueba.remota.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import prueba.remota.dto.CertificadoMantenimientoDetalleDto;

@Repository
@Transactional
public class CertificadoMantenimientoDetalleDao {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
	public List<CertificadoMantenimientoDetalleDto> obtenerDetalle(String compania, int numeroDoc) {
        return em.createNativeQuery("EXEC sp_cr_listadet_web :compania, :numeroDoc", "detalleMapping")
                .setParameter("compania", compania)
                .setParameter("numeroDoc", numeroDoc)
                .getResultList();
    }
}