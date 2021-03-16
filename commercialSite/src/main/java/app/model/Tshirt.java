package app.model;

import app.util.Quantity;

public class Tshirt extends Product {
	private int size;
	private String colour;

	public Tshirt(int productID, Quantity productQuantity, String productBrand, String productModel, String description,
			boolean inStock, int size, String colour) {
		super(productID, productQuantity, productBrand, productModel, description, inStock);	
	}

}
