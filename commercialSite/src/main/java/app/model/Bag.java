package app.model;

import app.util.Quantity;
import lombok.AllArgsConstructor;
import lombok.Data;



public class Bag extends Product {

	public Bag(int productID, Quantity productQuantity, String productBrand, String productModel, String description,
			boolean inStock) {
		super(productID, productQuantity, productBrand, productModel, description, inStock);
		// TODO Auto-generated constructor stub
	}

}
