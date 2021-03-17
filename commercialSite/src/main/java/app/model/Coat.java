package app.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import app.util.Quantity;
import lombok.Data;

@Entity
@Table(name = "coat")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "coat_type")
@Data

public class Coat extends Product {

	@Column
	private int size;
	@Column
	private String colour;

	public Coat(int productID, Quantity productQuantity, String productBrand, String productModel, String description,
			boolean inStock, String colour, int size) {
		super(productID, productQuantity, productBrand, productModel, description, inStock);

	}

}
