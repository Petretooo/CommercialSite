package app.repository.shoes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.model.Shoes;

@Repository
public interface ShoesRepository extends JpaRepository<Shoes, String> {

	List<Shoes> findBySize(int size);
}
