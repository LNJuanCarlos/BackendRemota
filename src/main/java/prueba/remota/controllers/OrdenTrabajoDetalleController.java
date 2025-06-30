package prueba.remota.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prueba.remota.dao.OrdenTrabajoDaoCRUD;
import prueba.remota.dto.OrdenTrabajoDetalle;
import prueba.remota.entitys.OrdenDeTrabajo;
import prueba.remota.services.OrdenTrabajoDetalleService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/ordenes-trabajo")
public class OrdenTrabajoDetalleController {

    @Autowired
    private OrdenTrabajoDetalleService detalleService;
    
    @Autowired
    private OrdenTrabajoDaoCRUD ordenTrabajoDao;

    @GetMapping("/detalle/{idOt}")
    public ResponseEntity<?> obtenerDetalleOrden(@PathVariable String idOt) {

        Map<String, Object> response = new HashMap<>();
        List<OrdenTrabajoDetalle> detalles;

        try {
            detalles = detalleService.obtenerDetallePorIdOT(idOt);

            if (detalles.isEmpty()) {
                response.put("mensaje", "No se encontraron detalles para la orden de trabajo con ID: " + idOt);
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            }

        } catch (DataAccessException e) {
            response.put("mensaje", "Error al acceder a la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(detalles, HttpStatus.OK);
    }
    
    @PutMapping("/comentario/{idOt}")
    public ResponseEntity<?> actualizarComentario(@PathVariable String idOt, @RequestBody Map<String, String> body) {
        String nuevoComentario = body.get("comentario");

        Optional<OrdenDeTrabajo> otOptional = ordenTrabajoDao.findById(idOt);
        if (!otOptional.isPresent()) {
            Map<String, String> error = new HashMap<>();
            error.put("mensaje", "Orden no encontrada");
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }

        OrdenDeTrabajo ot = otOptional.get();
        ot.setComentario(nuevoComentario);
        ordenTrabajoDao.save(ot);

        Map<String, String> response = new HashMap<>();
        response.put("mensaje", "Comentario actualizado");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
