package app.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import app.util.Quantity;
import app.util.ShoesSize;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "Bag")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "bag_type")
@Data
public class Bag extends Product {

	public Bag(int productID, Quantity productQuantity, String productBrand, String productModel, String description,
			boolean inStock) {
		super(productID, productQuantity, productBrand, productModel, description, inStock);
		// TODO Auto-generated constructor stub
	}

}
