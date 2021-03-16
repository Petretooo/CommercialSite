package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
	
	private int userID;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
}
