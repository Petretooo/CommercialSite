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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Tshirt {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tshirt_id")
	private String tshirtID;
	@Column(name = "tshirt_quantity")
	private Quantity tshirtQuantity;
	@Column(name = "tshirt_brand")
	private String tshirtBrand;
	@Column(name = "tshirt_model")
	private String tshirtModel; // male,female,unisex
	@Column
	private String description;
	@Column(name = "in_stock")
	private boolean inStock;
	@Column
	private int size;
	@Column
	private String colour;
	@Column
	private double price;

}
