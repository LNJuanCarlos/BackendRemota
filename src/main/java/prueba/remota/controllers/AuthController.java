package prueba.remota.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prueba.remota.dto.CambiarPasswordRequest;
import prueba.remota.dto.LoginRequest;
import prueba.remota.entitys.PF_UsuariosExtranet;
import prueba.remota.entitys.PersonaMast;
import prueba.remota.services.AuthService;
import prueba.remota.services.UsuarioService;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;
    
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {

        PF_UsuariosExtranet usuario =
                authService.login(request.getUsuario(), request.getPassword());

        if (usuario == null) {
            Map<String, Object> response = new HashMap<>();
            response.put("mensaje", "Usuario o contraseña incorrectos");
            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        }

        Map<String, Object> response = new HashMap<>();
        response.put("mensaje", "Login correcto");

        response.put("documento", request.getUsuario()); // ✅ DOCUMENTO
        response.put("persona", usuario.getPersona());   // ✅ ID PERSONA

        return ResponseEntity.ok(response);
    }
    
    @PostMapping("/cambiar-clave")
    public ResponseEntity<?> cambiarClave(@RequestBody CambiarPasswordRequest dto) {
    	
    	System.out.println("Documento recibido: " + dto.getDocumento());
        System.out.println("Clave actual: " + dto.getClaveActual());
        System.out.println("Nueva clave: " + dto.getNuevaClave());

        boolean exito = usuarioService.actualizarClavePorDocumento(
            dto.getDocumento(),   //IDENTIFICADOR REAL
            dto.getClaveActual(),
            dto.getNuevaClave()
        );

        Map<String, Object> response = new HashMap<>();

        if (exito) {
            response.put("ok", true);
            response.put("mensaje", "Contraseña actualizada correctamente");
            return ResponseEntity.ok(response);
        } else {
            response.put("ok", false);
            response.put("mensaje", "Contraseña actual incorrecta");
            return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
        }
    }
    
}