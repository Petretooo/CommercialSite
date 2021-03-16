package app.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import app.util.*;
import lombok.Data;

@Entity
@Table(name = "shoes")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "shoes_type")
@Data
public class Shoes extends Product {

	@Column(name = "shoes_size")
	private ShoesSize shoesSize;

	public Shoes(int productID, Quantity productQuantity, String productBrand, String productModel, String description,
			boolean inStock, ShoesSize shoesSize) {
		super(productID, productQuantity, productBrand, productModel, description, inStock);

	}

}
