package prueba.remota.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import prueba.remota.services.PagoProveedorService;

@RestController
@RequestMapping("/api/pagos")
public class PagoProveedorController {

    @Autowired
    private PagoProveedorService service;

    @GetMapping("/proveedor")
    public ResponseEntity<?> listar(
        @RequestParam Integer proveedor,
        @RequestParam String fechaInicio,
        @RequestParam String fechaFin
    ) {

        return ResponseEntity.ok(
            service.listar(proveedor, fechaInicio, fechaFin)
        );
    }
}
