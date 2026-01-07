package prueba.remota.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.remota.dao.AuthDao;
import prueba.remota.entitys.PF_UsuariosExtranet;

@Service
public class AuthService {

    @Autowired
    private AuthDao authDao;

    public PF_UsuariosExtranet login(String usuario, String password) {
        return authDao.login(usuario, password);
    }
}

