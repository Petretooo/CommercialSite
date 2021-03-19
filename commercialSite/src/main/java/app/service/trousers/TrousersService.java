package app.service.trousers;

import java.util.List;

import app.model.Trousers;

public interface TrousersService {

	public List<Trousers> getAllTrousersByColour(String colour);

	public List<Trousers> getAllTrousersInStock();

	public List<Trousers> getAllTrousersBySpecificSize(int size);

	public List<Trousers> getAllTrousersByPrice(double price);

	public List<Trousers> getAllTrousersByModel(String model);

	public Trousers save(Trousers tr);

}
