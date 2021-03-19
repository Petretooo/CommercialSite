package app.repository.coat;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.model.Coat;

@Repository
public interface CoatRepository extends JpaRepository<Coat, String> {

	List<Coat> findByColour(String colour);

	List<Coat> findByInStockIsTrue();

	List<Coat> findBySize(int size);

	List<Coat> findByBrand(String brandName);
}
