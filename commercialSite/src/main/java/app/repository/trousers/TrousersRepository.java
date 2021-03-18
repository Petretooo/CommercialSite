package app.repository.trousers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.model.Trousers;

@Repository
public interface TrousersRepository extends CrudRepository<Trousers, String> {

}
