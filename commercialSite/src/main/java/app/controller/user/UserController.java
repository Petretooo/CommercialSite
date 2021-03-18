package app.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.model.User;
import app.service.user.UserService;
import app.service.user.UserServiceImpl;

@Controller
@RequestMapping("/app")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public void getUser() {
//		User user = new User();
//		
//		user.setFirstName("Simona");
//		user.setLastName("Georgieva");
//		user.setEmail("jaskghjalkga");
//		user.setPassword("fhjaslghaga");
		
		String name = "Simona";
		
		System.out.println("-----------------------------------------------------");
		userService.getAllUsersByFirstName(name).stream().forEach(e -> System.out.println(e));
	}
	
}
