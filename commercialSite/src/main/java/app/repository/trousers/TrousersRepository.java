package app.repository.trousers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.model.Trousers;

@Repository
public interface TrousersRepository extends JpaRepository<Trousers, String> {

	List<Trousers> findByColour(String colour);

	List<Trousers> findByInStockIsTrue();

	List<Trousers> findBySize(int size);

	List<Trousers> findByPriceGreaterThanEqual(double price);

	List<Trousers> findBytrousersModel(String model);


}
