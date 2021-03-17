package app.repository.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{}
