package app.repository.shoppingCart;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.ShoppingCart;

public interface ShoppingCartRepo<E> extends JpaRepository<ShoppingCart<E>, String> {

}
