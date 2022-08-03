package pe.idat.edu.BodegaMicroServicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.edu.BodegaMicroServicio.model.Bodega;
import pe.idat.edu.BodegaMicroServicio.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService {
	
	@Autowired
	private BodegaRepository repository;

	@Override
	public List<Bodega> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Bodega obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Bodega bodega) {
		// TODO Auto-generated method stub
		repository.save(bodega);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Bodega bodega) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(bodega);

	}

}
