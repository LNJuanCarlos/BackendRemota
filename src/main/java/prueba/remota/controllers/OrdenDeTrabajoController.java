package prueba.remota.controllers;

import java.util.HashMap;
import java.util.Map;

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

import prueba.remota.entitys.OrdenDeTrabajo;
import prueba.remota.services.OrdenTrabajoService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/ordenes")
public class OrdenDeTrabajoController {

    @Autowired
    private OrdenTrabajoService ordenService;

    // Buscar una OT por su ID
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable String id) {
        Map<String, Object> response = new HashMap<>();
        OrdenDeTrabajo ot = null;

        try {
            ot = ordenService.buscarPorId(id);
            if (ot == null) {
                response.put("mensaje", "La orden de trabajo con ID " + id + " no existe.");
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            }
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al consultar la base de datos.");
            response.put("error", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(ot, HttpStatus.OK);
    }

    // Actualizar comentario de una OT
    @PutMapping("/{id}/comentario")
    public ResponseEntity<?> actualizarComentario(
            @PathVariable String id,
            @RequestBody Map<String, String> payload) {

        Map<String, Object> response = new HashMap<>();

        try {
            OrdenDeTrabajo ot = ordenService.buscarPorId(id);

            if (ot == null) {
                response.put("mensaje", "No se encontró la OT con ID: " + id);
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            }

            String nuevoComentario = payload.get("comentario");
            ot.setComentario(nuevoComentario);
            ordenService.guardar(ot);

            response.put("mensaje", "Comentario actualizado correctamente");
            response.put("orden", ot);
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (DataAccessException e) {
            response.put("mensaje", "Error al actualizar el comentario");
            response.put("error", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
