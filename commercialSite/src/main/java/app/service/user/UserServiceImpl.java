 package app.service.user;

import org.springframework.stereotype.Service;

import app.model.User;
import app.repository.user.UserDao;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	
	UserDao userDao;
	
	
	public void addUser(User user) {
		userDao.createUser(user);
	}


	@Override
	public User getUser(int id) {
		
		//TODO
		return userDao.getUser(id);
	}
	
}
