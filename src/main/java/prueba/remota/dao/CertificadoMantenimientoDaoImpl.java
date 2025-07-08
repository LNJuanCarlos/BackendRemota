package prueba.remota.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import prueba.remota.dto.CertificadoMantenimientoDto;

@Repository
public class CertificadoMantenimientoDaoImpl implements CertificadoMantenimientoDao{
	
	 @PersistenceContext
	    private EntityManager entityManager;

	    @Override
	    public CertificadoMantenimientoDto obtenerPorOrden(String ordenTrabajo) {
	        try {
	            return (CertificadoMantenimientoDto) entityManager.createNamedStoredProcedureQuery("certificado.obtenerPorOrden")
	                .setParameter("ordenTrabajo", ordenTrabajo)
	                .getSingleResult();
	        } catch (NoResultException e) {
	            return null;
	        }
	    }

}
