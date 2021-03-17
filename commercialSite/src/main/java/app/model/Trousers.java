package app.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import app.util.Quantity;

@Entity
@Table(name = "torusers")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "trousers_type")
 
public class Trousers extends Product {
	public Trousers(int productID, Quantity productQuantity, String productBrand, String productModel,
			String description, boolean inStock) {
		super(productID, productQuantity, productBrand, productModel, description, inStock);
		// TODO Auto-generated constructor stub
	}

}