package pe.idat.edu.ProductoMicroServicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.edu.ProductoMicroServicio.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
