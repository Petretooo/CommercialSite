package app.model;

import app.util.Quantity;

public class Coat extends Product {

	private int size;
	private String colour;

	public Coat(int productID, Quantity productQuantity, String productBrand, String productModel, String description,
			boolean inStock, String colour, int size) {
		super(productID, productQuantity, productBrand, productModel, description, inStock);

	}

}
