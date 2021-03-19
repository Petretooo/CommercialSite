package app.repository.shoes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.model.Shoes;
import app.util.ShoesSize;

@Repository
public interface ShoesRepository extends JpaRepository<Shoes, String> {

	List<Shoes> findBySize(ShoesSize size);
	
	List<Shoes> findByPriceLessThanEqual(double price);
	
	List<Shoes> findByInStockIsTrue();
	
	List<Shoes> findBySizeEquals(int size);
	
	List<Shoes> findByBrandEquals(String brand);
}
