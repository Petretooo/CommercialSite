package app.service.user;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.User;
import app.repository.user.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	public void addUser(User user) {
		if(user == null) {
			return;
		}
		userRepository.save(user);
	}

	@Override
	public User getUser(String uuid) {
		return userRepository.getOne(uuid);
	}

	@Override
	public List<User> getAllUsersByFirstName(String name) {
		return userRepository.findByFirstName(name);
	}
	
	

	
}
