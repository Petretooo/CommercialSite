package app.service.bags;

import java.util.List;

import org.springframework.stereotype.Service;

import app.model.Bag;

@Service
public interface BagsService {

	List<Bag> getAllBagsByColour(String colour);

	List<Bag> getAllBagInStock();

	List<Bag> getAllBagsBySize(int size);

	List<Bag> getAllBagsByBrand(String brandName);

	List<Bag> getAllBagsByDescription(String description);


}
