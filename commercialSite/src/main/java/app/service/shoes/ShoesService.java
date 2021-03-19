package app.service.shoes;

import java.util.List;

import org.springframework.stereotype.Service;

import app.model.Shoes;

@Service
public interface ShoesService {
	public List<Shoes> getAllShoes();

	public Shoes save(Shoes shoes);

	public List<Shoes> getAllShoesByBrand(String brand);

	public boolean checkIfInStock(String Id);

	public List<Shoes> purchaseShoes(Shoes sh);

	public List<Shoes> shoesByPrice(double price);
	
	public List<Shoes> getAllShoesBySize(int size);
}
