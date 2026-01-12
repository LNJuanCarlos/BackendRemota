package prueba.remota.services;

import java.util.List;

import prueba.remota.dto.PagoProveedorDto;

public interface PagoProveedorService {
    List<PagoProveedorDto> listar(Integer proveedor, String inicio, String fin);
}
