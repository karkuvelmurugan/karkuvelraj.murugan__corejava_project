package day03.practice;

public class UserApp {
	public static void main(String[] args) {

		 User user1 = new User();
		 user1.setName("Raj");
	     user1.setEmail("Raj@gmail.com");
	     user1.setId(1411);
	     user1.setPassword("AkiRaj@141118");
	 	 System.out.println("Name = " + user1.getName() + ", Email = " + user1.getEmail() + ", Password = " + user1.getPassword()+ ", ID = " + user1.getId());

	 	 User user2 = new User(141118, "Akila", "akila@gmail.com", "Akila1411");
	 	 System.out.println("Name = " + user2.getName() + ", Email = " + user2.getEmail() + ", Password = " + user2.getPassword()+ ", ID = " + user2.getId());
	}
}
