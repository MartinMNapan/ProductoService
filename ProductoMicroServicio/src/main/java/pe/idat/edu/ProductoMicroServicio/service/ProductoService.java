package pe.idat.edu.ProductoMicroServicio.service;

import java.util.List;

import pe.idat.edu.ProductoMicroServicio.model.Producto;


public interface ProductoService {
	
	List<Producto> listarProductos();
	Producto obtenerProductoId(Integer id);
	void guardarProducto(Producto producto);
	void eliminarProducto(Integer id);
	void actualizarAula(Producto producto);
	
	void asignarEstudianteAula();

}
