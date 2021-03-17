package app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import app.util.Quantity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@MappedSuperclass
class Product {

	@Id
	@Column(name = "product_id")
	private int productID;
	@Column(name = "product_quantity")
	private Quantity productQuantity;
	@Column(name = "product_brand")
	private String productBrand;
	@Column(name = "product_model")
	private String productModel; // male,female,unisex
	@Column
	private String description;
	@Column
	private boolean inStock;

}
