package app.repository.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	
	List<User> findByFirstName(String name);
}