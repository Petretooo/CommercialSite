package app.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import app.util.*;
import lombok.Data;

@Entity
@Data
public class Shoes {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "shoes_id")
	private int shoesID;
	@Column(name = "shoes_quantity")
	private Quantity shoesQuantity;
	@Column(name = "shoes_brand")
	private String shoesBrand;
	@Column(name = "shoes_model")
	private String shoesModel; // male,female,unisex
	@Column
	private String description;
	@Column
	private boolean inStock;
	@Column(name = "shoes_size")
	private ShoesSize shoesSize;

}
