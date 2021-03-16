package app.repository.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import app.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	List<User> users = new ArrayList<>();

	@Override
	public void createUser(User user) {
		users.add(user);
	}

	@Override
	public boolean deleteUser(User user) {
		return users.remove(user);
	}


	@Override
	public User getUser(int id) {
		return users.stream().filter(x-> x.getUserID() == id).findFirst().orElse(null);
	}

}
