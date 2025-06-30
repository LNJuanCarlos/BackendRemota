package prueba.remota.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prueba.remota.entitys.Producto;
import prueba.remota.services.ProductoService;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins= {"http://localhost:4200"})
public class ProductoController {
	
	@Autowired
	private ProductoService productoservice;
	
	@GetMapping("/listar")
	public ResponseEntity<?> listarProducto(){
		List<Producto> producto = null;
		
		Map<String, Object> response = new HashMap<>();
		
		try {
			producto = productoservice.listarProductos();
		} catch (DataAccessException e) {
			// TODO: handle exception
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<Producto>>(producto, HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<?> crearProducto(@RequestBody Producto producto){
		Producto productonuevo = null;
		
		Map<String, Object> response = new HashMap<>();
		
		try {
			productonuevo = productoservice.grabarProducto(producto);
		} catch (DataAccessException e) {
			// TODO: handle exception
			response.put("error", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje", "Se ah creado correctamente el producto!");
		response.put("producto", productonuevo);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<?> actualizarProducto(@RequestBody Producto producto){
		Producto productoActual = productoservice.buscarProductoxID(producto.getId());
		Producto productoActualizado = null;
		
		Map<String, Object> response = new HashMap<>();
		
		if(productoActual == null) {
			response.put("mensaje", "El producto con el ID: ".concat(producto.getId().toString().concat("no existe")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		
		try {
			productoActual.setCodigo(producto.getCodigo());
			productoActual.setNombre(producto.getNombre());
			productoActualizado = productoservice.grabarProducto(productoActual);
		} catch (DataAccessException e) {
			// TODO: handle exception
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje", "Se ah actualizado correctamente el Producto!");
		response.put("producto", productoActualizado);
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> eliminarPorId(@PathVariable String id){
		Map<String, Object> response = new HashMap<>();
		
		try {
			productoservice.eliminarProductoxID(id);
		} catch (DataAccessException e) {
			// TODO: handle exception
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(":").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje", "Se ah eliminado el producto correctamente!");
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
	}

}
