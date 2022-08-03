package pe.idat.edu.BodegaMicroServicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.edu.BodegaMicroServicio.model.Bodega;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer>{

}
