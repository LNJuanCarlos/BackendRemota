package prueba.remota.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import prueba.remota.entitys.Producto;


@Service
@Transactional
public interface ProductoDao extends CrudRepository<Producto, String>{

}
