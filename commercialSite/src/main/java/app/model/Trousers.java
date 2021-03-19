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
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Trousers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "trousers_id")
	private String trousersID;
	@Column(name = "trousers_quantity")
	private Quantity trousersQuantity;
	@Column(name = "trousers_brand")
	private String trousersBrand;
	@Column(name = "trousers_model")
	private String trousersModel; // male,female,unisex
	@Column
	private String description;
	@Column(name = "in_stock")
	private boolean inStock;
	@Column
	private String colour;
	@Column
	private double price;

}