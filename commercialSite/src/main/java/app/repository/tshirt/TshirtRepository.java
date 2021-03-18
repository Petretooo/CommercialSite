package app.repository.tshirt;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.model.Tshirt;

@Repository
public interface TshirtRepository extends CrudRepository<Tshirt, String> {

}
