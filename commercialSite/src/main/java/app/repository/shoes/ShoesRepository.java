package app.repository.shoes;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.model.Shoes;

@Repository
public interface ShoesRepository extends CrudRepository<Shoes, String> {

}
