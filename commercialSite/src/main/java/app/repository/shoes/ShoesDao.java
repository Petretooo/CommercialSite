package app.repository.shoes;

import app.model.Shoes;

public interface ShoesDao {

	public void purchaseShoes(Shoes aModel);

	public Shoes getSpecificModel(Shoes shoesID);

	public boolean inStock(Shoes aModel);

	public boolean selectShoesModel(Shoes aModel);

	public boolean unselectShoesModel(Shoes aModel);
	
	public void askForSize(Shoes aModel);

}
