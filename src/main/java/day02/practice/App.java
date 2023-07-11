package day02.practice;

public class App {
public static void main(String[] args) {
		
		User user = new User();
		user.setName("karku");
		user.setId(1411);
		user.setEmail("raj@gmail.com");
		user.setPassword("AkiRaj@141118");
		
		
		//Create a logger class and utility methods (log, debug , error) and accepts different parameters (Logger class App)
		
		logger.debug("Debug your code.");
		logger.info("Information is not valid.");
		logger.error("Error");
		logger.debug(401);
		logger.info(100);
		logger.error(404);
		
	}
}
