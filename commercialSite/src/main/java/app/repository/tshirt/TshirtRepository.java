package app.repository.tshirt;

import org.springframework.data.repository.CrudRepository;

import app.model.Tshirt;

public interface TshirtRepository extends CrudRepository<Tshirt, String> {

}
