package pe.idat.edu.BodegaMicroServicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pe.idat.edu.BodegaMicroServicio.model.Bodega;
import pe.idat.edu.BodegaMicroServicio.service.BodegaService;

@Controller
@RequestMapping(path = "/api/bodega/v1")
public class BodegaController {
	
	@Autowired
	private BodegaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Bodega> listar(){
		return service.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Bodega obtener(@PathVariable Integer id ) {
		return service.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Bodega bodega) {
		service.guardar(bodega);	
		return new ResponseEntity<>(HttpStatus.CREATED);
	}	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Bodega bodega) {
		service.actualizar(bodega);
	}

	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	

}
