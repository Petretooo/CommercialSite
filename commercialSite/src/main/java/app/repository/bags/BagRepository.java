package app.repository.bags;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.model.Bag;

@Repository
public interface BagRepository extends CrudRepository<Bag, String> {
	
	
	
}