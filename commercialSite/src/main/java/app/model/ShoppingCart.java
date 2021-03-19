package app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ShoppingCart<E> {

	@Column
	private List<E> items;
	@Column
	private double totalAmount;
	@Column
	private String discountCode;
	@Column
	private double deliveryPice;
	@Column
	private double discount;
	@Column
	private User user;
	@Column
	private String address;

}
