package prueba.remota.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.remota.dao.OrdenTrabajoDaoCRUD;
import prueba.remota.entitys.OrdenDeTrabajo;

@Service
@Transactional
public class OrdenTrabajoService {

	@Autowired
    private OrdenTrabajoDaoCRUD dao;

    public OrdenDeTrabajo buscarPorId(String idOt) {
        return dao.findById(idOt).orElse(null);
    }

    public OrdenDeTrabajo guardar(OrdenDeTrabajo orden) {
        return dao.save(orden);
    }

    public boolean actualizarComentario(String idOt, String nuevoComentario) {
        OrdenDeTrabajo orden = buscarPorId(idOt);
        if (orden != null) {
            orden.setComentario(nuevoComentario);
            dao.save(orden);
            return true;
        }
        return false;
    }
}