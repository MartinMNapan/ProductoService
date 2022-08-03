package pe.idat.edu.BodegaMicroServicio.service;

import java.util.List;

import pe.idat.edu.BodegaMicroServicio.model.Bodega;

public interface BodegaService {
	
	List<Bodega> listar();
	Bodega obtenerId(Integer id);
	void guardar(Bodega bodega);
	void eliminar(Integer id);
	void actualizar(Bodega bodega);
	

}
