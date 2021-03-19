package app.service.shoppingCart;

import java.util.List;

public interface ShoppingCartService<E> {

	public void addToCart(E e);

	public List<E> showCart();

	public void removeFromCart(String uuid);

	public double getTotalAmount();

	public void applyCoupon(String coupon);

	public void printInvoice();
}
