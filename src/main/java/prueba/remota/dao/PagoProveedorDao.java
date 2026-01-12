package prueba.remota.dao;

import java.util.List;

import prueba.remota.dto.PagoProveedorDto;

public interface PagoProveedorDao {

    List<PagoProveedorDto> listarPorProveedorYFechas(
        Integer proveedor,
        String fechaInicio,
        String fechaFin
    );
}
