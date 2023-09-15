package day07.practice;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Task {
	private int id;
	private String name;
	private LocalDate deadline;
	
	public String getName() {
		return name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}
	
	public Task(String name) {
		this.name = name;
	}
	
	public Task (String name, String deadLine) {
		
		this.name = name;
		try {
            this.deadline = LocalDate.parse(deadLine);
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid deadline format. Please use the format 'YYYY-MM-DD'");
        }
	}
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Task task = (Task) obj;
	        return name.equals(task.name) && deadline.equals(task.deadline);
	    }

	    @Override
	    public int hashCode() {
	        return 31 * name.hashCode() + deadline.hashCode();
	    }
	    
		@Override
		public String toString() {
			return "Task [name=" + name + ", deadline=" + deadline + "]";
		}
	
}
