package pe.idat.edu.ProductoMicroServicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.edu.ProductoMicroServicio.model.Producto;
import pe.idat.edu.ProductoMicroServicio.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	@Override
	public List<Producto> listarProductos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Producto obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardarProducto(Producto producto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizarAula(Producto producto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void asignarEstudianteAula() {
		// TODO Auto-generated method stub

	}

}
