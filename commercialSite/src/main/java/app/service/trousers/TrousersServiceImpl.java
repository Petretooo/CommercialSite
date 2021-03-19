package app.service.trousers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import app.model.Trousers;
import app.repository.trousers.TrousersRepository;

public class TrousersServiceImpl implements TrousersService {

	@Autowired
	TrousersRepository trousersRepository;

	@Override
	public List<Trousers> getAllTrousersByColour(String colour) {
		return trousersRepository.findByColour(colour);
	}

	@Override
	public List<Trousers> getAllTrousersInStock() {
		return trousersRepository.findByInStockIsTrue();
	}

	@Override
	public List<Trousers> getAllTrousersBySpecificSize(int size) {
		return trousersRepository.findBySize(size);
	}

	@Override
	public List<Trousers> getAllTrousersByPrice(double price) {
		return trousersRepository.findByPriceGreaterThanEqual(price);
	}

	@Override
	public List<Trousers> getAllTrousersByModel(String model) {
		return trousersRepository.findBytrousersModel(model);

	}

	@Override
	public Trousers save(Trousers tr) {
		return trousersRepository.save(tr);
	}

}
