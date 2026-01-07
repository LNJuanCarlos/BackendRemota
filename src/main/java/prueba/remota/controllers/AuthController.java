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

import prueba.remota.dto.LoginRequest;
import prueba.remota.entitys.PF_UsuariosExtranet;
import prueba.remota.services.AuthService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {

        Map<String, Object> response = new HashMap<>();

        PF_UsuariosExtranet usuario =
                authService.login(request.getUsuario(), request.getPassword());

        if (usuario == null) {
            response.put("mensaje", "Usuario o contraseña incorrectos");
            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
        }

        response.put("mensaje", "Login correcto");
        response.put("persona", usuario.getPersona());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}