package day10.solved;


public class UsingCustomExceptionsDemo {

	public static void main(String[] args) {
		Task task = new Task();
//		task.setName("Creating test case"); Commenting this so that exception is thrown
		
		try {
			TaskValidator.validate(task);
		} catch (ValidationException e) {
			e.printStackTrace();
		}
	}
	
}
