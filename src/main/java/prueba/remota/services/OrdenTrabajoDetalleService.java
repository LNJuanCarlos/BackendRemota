package prueba.remota.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.remota.dao.OrdenTrabajoDetalleDaoREPOSITORY;
import prueba.remota.dto.OrdenTrabajoDetalle;

@Service
public class OrdenTrabajoDetalleService {
	
	 @Autowired
	    private OrdenTrabajoDetalleDaoREPOSITORY dao;

	    public List<OrdenTrabajoDetalle> obtenerDetallePorIdOT(String idOt) {
	        return dao.obtenerDetalleOrdenTrabajo(idOt);
	    }
	}
