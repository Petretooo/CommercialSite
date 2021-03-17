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
import app.util.ShoesSize;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
public class Bag {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "bag_id")
	private int bagID;
	@Column(name = "bag_quantity")
	private Quantity bagQuantity;
	@Column(name = "bag_brand")
	private String bagBrand;
	@Column(name = "bag_model")
	private String bagModel; // male,female,unisex
	@Column
	private String description;
	@Column(name = "in_stock")
	private boolean inStock;

}
