package prueba.remota.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.remota.dao.PagoProveedorDao;
import prueba.remota.dto.PagoProveedorDto;

@Service
public class PagoProveedorServiceImpl implements PagoProveedorService {

    @Autowired
    private PagoProveedorDao dao;

    @Override
    public List<PagoProveedorDto> listar(Integer proveedor, String inicio, String fin) {
        return dao.listarPorProveedorYFechas(proveedor, inicio, fin);
    }
}
