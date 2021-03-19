package app.service.bags;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import app.model.Bag;
import app.repository.bags.BagRepository;

public class BagsServiceImpl implements BagsService {

	@Autowired
	BagRepository bagsRepostiroy;

	@Override
	public List<Bag> getAllBagsByColour(String colour) {
		return bagsRepostiroy.findByColour(colour);
	}

	@Override
	public List<Bag> getAllBagInStock() {
		return bagsRepostiroy.findByInStockIsTrue();
	}

	@Override
	public List<Bag> getAllBagsBySize(int size) {
		return bagsRepostiroy.findBySize(size);
	}

	@Override
	public List<Bag> getAllBagsByBrand(String brandName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bag> getAllBagsByDescription(String descriptionByUser) {
		String[] splitDescriptionByUser = descriptionByUser.split(", ");

		List<Bag> allBags = bagsRepostiroy.findAll();
		List<Bag> bagsByDescription = new ArrayList<>();
		for (int i = 0; i < allBags.size(); i++) {
			if (allBags.get(i).getDescription().split(",").equals(splitDescriptionByUser)) {
				bagsByDescription.add(allBags.get(i));
			}
		}
		return bagsByDescription;

	}

}
