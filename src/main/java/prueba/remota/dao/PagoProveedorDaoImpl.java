package prueba.remota.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import prueba.remota.dto.PagoProveedorDto;


@Repository
public class PagoProveedorDaoImpl implements PagoProveedorDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<PagoProveedorDto> listarPorProveedorYFechas(Integer proveedor, String fechaInicio, String fechaFin) {

        return em.createNativeQuery(
            "EXEC cr_sp_listadepagowebproveedores :proveedor, :fechaInicio, :fechaFin",
            "PagoProveedorMapping"
        )
        .setParameter("proveedor", proveedor)
        .setParameter("fechaInicio", fechaInicio)
        .setParameter("fechaFin", fechaFin)
        .getResultList();
    }
}