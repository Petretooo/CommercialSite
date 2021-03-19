package app.service.coat;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.model.Coat;

public interface CoatService {

	public Coat save(Coat coat);

	public List<Coat> getAllCoatsByColour(String colour);

	public List<Coat> getAllCoatsInStock();

	public List<Coat> getAllCoatsBySize(int size);

	public List<Coat> getAllCoatsByBrand(String brandName);

}
