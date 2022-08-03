package pe.idat.edu.ProductoMicroServicio.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "detalle_producto")
public class ProductoDetalle {
	@EmbeddedId
	private ProductoBodegaFK fk = new ProductoBodegaFK();

	public ProductoBodegaFK getFk() {
		return fk;
	}

	public void setFk(ProductoBodegaFK fk) {
		this.fk = fk;
	}

}
