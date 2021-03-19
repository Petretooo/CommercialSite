package app.service.coat;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import app.model.Coat;
import app.repository.coat.CoatRepository;

public class CoatServiceImpl implements CoatService {

	@Autowired
	CoatRepository coatRepository;

	@Override
	public Coat save(Coat coat) {
		return coatRepository.save(coat);
	}

	@Override
	public List<Coat> getAllCoatsByColour(String colour) {
		return coatRepository.findByColour(colour);
	}

	@Override
	public List<Coat> getAllCoatsInStock() {
		return coatRepository.findByInStockIsTrue();
	}

	@Override
	public List<Coat> getAllCoatsBySize(int size) {
		return coatRepository.findBySize(size);
	}

	@Override
	public List<Coat> getAllCoatsByBrand(String brandName) {
		return coatRepository.findByBrand(brandName);
	}

}
