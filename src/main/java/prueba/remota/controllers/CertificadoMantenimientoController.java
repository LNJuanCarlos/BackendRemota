package prueba.remota.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import prueba.remota.dto.CertificadoMantenimientoDetalleDto;
import prueba.remota.dto.CertificadoMantenimientoDto;
//import prueba.remota.services.CertificadoMantenimientoDetalleService;
import prueba.remota.services.CertificadoMantenimientoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/certificados")
public class CertificadoMantenimientoController {

    @Autowired
    private CertificadoMantenimientoService service;
    
    //@Autowired
    //private CertificadoMantenimientoDetalleService detalleService;

    @GetMapping("/{compania}/{numerodoc}")
    public List<CertificadoMantenimientoDto> obtener(@PathVariable String compania, @PathVariable int numerodoc) {
        return service.obtener(compania, numerodoc);
    }
    
    /*@GetMapping("/detalle/{compania}/{numeroDoc}")
    public List<CertificadoMantenimientoDetalleDto> obtenerDetalle(
            @PathVariable String compania,
            @PathVariable int numeroDoc) {
        return detalleService.obtenerDetalle(compania, numeroDoc);
    }*/
}