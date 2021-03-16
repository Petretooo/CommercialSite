package app.repository.bags;

import app.model.Bag;

public interface BagDao {

	public void purchaseBag(Bag aBag);
	
	public Bag getSpecificModel(Bag bagId);
	
	public boolean inStock(Bag aBag);
	
	public boolean unselectBagModel(Bag aBag);
	
	
	
	
}
