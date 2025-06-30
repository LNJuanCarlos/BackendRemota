package prueba.remota.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;

import prueba.remota.dto.OrdenTrabajoDetalle;


@Repository
public class OrdenTrabajoDetalleDaoREPOSITORY {

    @PersistenceContext
    private EntityManager em;

    public List<OrdenTrabajoDetalle> obtenerDetalleOrdenTrabajo(String idOt) {
        Query query = em.createNativeQuery("EXEC usp_obtener_orden_trabajo :id_ot");
        query.setParameter("id_ot", idOt);

        @SuppressWarnings("unchecked")
        List<Object[]> resultados = query.getResultList();

        List<OrdenTrabajoDetalle> detalles = new ArrayList<>();

        for (Object[] fila : resultados) {
            OrdenTrabajoDetalle detalle = new OrdenTrabajoDetalle();
            detalle.setIdOt((String) fila[0]);
            detalle.setCodigoProducto((String) fila[1]);
            detalle.setNombreProducto((String) fila[2]);
            detalle.setCantidadSolicitada((Integer) fila[3]);
            detalle.setCantidadEnStock((Integer) fila[4]);
            detalle.setComentario((String) fila[5]);

            detalles.add(detalle);
        }

        return detalles;
    }
}