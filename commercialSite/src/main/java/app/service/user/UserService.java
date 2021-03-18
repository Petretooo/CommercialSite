package app.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import app.model.User;

public interface UserService {
	
	public void addUser(User user);
	public User getUser(String uuid);
	public List<User> getAllUsersByFirstName(String name);
}
