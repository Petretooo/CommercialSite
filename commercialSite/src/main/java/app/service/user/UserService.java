package app.service.user;

import app.model.User;

public interface UserService {

	public void addUser(User user);

	public User getUser(int id);
}
