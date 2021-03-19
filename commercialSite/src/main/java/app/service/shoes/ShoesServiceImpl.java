package app.service.shoes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.Shoes;
import app.repository.shoes.ShoesRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Service
@AllArgsConstructor

public class ShoesServiceImpl implements ShoesService {

	@Autowired
	ShoesRepository shoesRepository;

	@Override
	public List<Shoes> getAllShoes() {
		return shoesRepository.findAll();
	}

	@Override
	public Shoes save(Shoes shoes) {
		return shoesRepository.save(shoes);
	}

	@Override
	public List<Shoes> getAllShoesByBrand(String brand) {
		List<Shoes> shoesByBrand = new ArrayList<>();
		shoesByBrand.add(shoesRepository.getOne(brand));
		return shoesByBrand;
	}

	@Override
	public boolean checkIfInStock(String Id) {
		boolean flag = false;
		if (shoesRepository.getOne(Id).isInStock()) {
			flag = true;
		}
		return flag;
	}

	@Override
	public List<Shoes> purchaseShoes(Shoes sh) {
		List<Shoes> purchasedShoesList = new ArrayList<>();
		if (sh.getClass().equals(Shoes.class)) {
			purchasedShoesList.add(sh);
		}

		return purchasedShoesList;
	}

	@Override
	public List<Shoes> shoesByPrice(double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Shoes> getAllShoesBySize(int size) {
		return shoesRepository.findBySize(size);
	}

}