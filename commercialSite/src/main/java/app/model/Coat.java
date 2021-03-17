package app.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import app.util.Quantity;
import lombok.Data;

//@Entity
@Data
public class Coat {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
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
	@Column
	private int size;
	@Column
	private String colour;

}
