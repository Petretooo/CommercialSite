package app.repository.coat;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.model.Coat;

@Repository
public interface CoatRepository extends CrudRepository<Coat, String> {

}
