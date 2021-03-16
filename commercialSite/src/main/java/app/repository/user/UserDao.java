package app.repository.user;

import app.model.User;

public interface UserDao {

	public void createUser(User user);

	public boolean deleteUser(User user);

	public User getUser(int id);
}
