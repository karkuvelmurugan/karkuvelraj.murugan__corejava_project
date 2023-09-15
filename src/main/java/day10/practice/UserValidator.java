package day10.practice;

import java.util.ArrayList;

class UserAlreadyExistsException extends Exception {

	private static final long serialVersionUID = -8105491977357554060L;

	public UserAlreadyExistsException(String msg) {
		super(msg);
	}

	public UserAlreadyExistsException(Throwable te) {
		super(te);
	}

	public UserAlreadyExistsException(String msg, Throwable te) {
		super(msg, te);
	}
}

class User {

	private int id;
	private String name;
	private String emailId;

	public User(String name, String emailId, int id) {
		this.name = name;
		this.emailId = emailId;
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + "]";
	}


}

class UserValidation {
	static ArrayList<User> arr = new ArrayList<User>();
	public static boolean register(User user) throws UserAlreadyExistsException {
		if (user == null) {
			throw new UserAlreadyExistsException("User Object Cannot be Null");
		}

		for (User element : arr) {
			if (element.getEmailId() == user.getEmailId()) {
				throw new UserAlreadyExistsException("User already added");
			}
		}

		arr.add(user);
		System.out.println("User added: " + user.toString());
		return true;
	}
}

public class UserValidator{

	public static void main(String[] args) {
		try {
			User user1 = new User("Uthra", "uthra@gmail.com", 1);
			User user2 = new User("Meena", "meena@gmail.com", 2);
			User user3 = new User("Uthra"
					+ "", "uthra@gmail.com", 1);

			UserValidation.register(user1); 
			UserValidation.register(user2); 
			UserValidation.register(user3); 
		} catch (UserAlreadyExistsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}