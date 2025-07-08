package prueba.remota.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prueba.remota.dto.CertificadoMantenimientoDto;
import prueba.remota.services.CertificadoMantenimientoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/certificados")
public class CertificadoMantenimientoController {

    @Autowired
    private CertificadoMantenimientoService service;

    @GetMapping("/orden/{ordenTrabajo}")
    public ResponseEntity<CertificadoMantenimientoDto> obtenerPorOrden(@PathVariable String ordenTrabajo) {
        CertificadoMantenimientoDto dto = service.obtenerPorOrden(ordenTrabajo);
        if (dto == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

}
