package app.repository.bags;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.model.Bag;
import app.model.Coat;

@Repository
public interface BagRepository extends JpaRepository<Bag, String> {

	List<Bag> findByColour(String colour);

	List<Bag> findByInStockIsTrue();

	List<Bag> findBySize(int size);

	List<Bag> findByBrand(String brandName);

	List<Bag> findByDescription(String description);

}