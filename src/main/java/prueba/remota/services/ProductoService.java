package prueba.remota.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.remota.dao.ProductoDao;
import prueba.remota.entitys.Producto;

@Service
@Transactional
public class ProductoService {
	
	@Autowired
	private ProductoDao productodao;
	
	public List<Producto> listarProductos(){
		return (List<Producto>) productodao.findAll();
	}
	
	public Producto grabarProducto(Producto producto) {
		return productodao.save(producto);
		
	}
	
	public Producto buscarProductoxID(String ID) {
		return productodao.findById(ID).get();
		
	}
	
	public void eliminarProductoxID(String ID) {
		productodao.deleteById(ID);
	}

}
