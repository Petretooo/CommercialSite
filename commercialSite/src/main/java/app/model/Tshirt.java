package app.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import app.util.Quantity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "Tshirt")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "tshirt_type")
@Data

public class Tshirt extends Product {
	@Column
	private int size;
	@Column
	private String colour;

	public Tshirt(int productID, Quantity productQuantity, String productBrand, String productModel, String description,
			boolean inStock, int size, String colour) {
		super(productID, productQuantity, productBrand, productModel, description, inStock);
	}

}
