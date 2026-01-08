package prueba.remota.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.remota.dao.AuthDao;


@Service
public class UsuarioService {

    @Autowired
    private AuthDao usuarioDao;

    @Transactional
    public boolean actualizarClavePorDocumento(
            String documento,
            String claveActual,
            String nuevaClave) {

        int filas = usuarioDao.actualizarClave(documento, claveActual, nuevaClave);
        return filas > 0;
    }
}