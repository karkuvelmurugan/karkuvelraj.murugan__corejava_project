package day07.practice;

import java.util.*;

public class RemoveDuplicateTasks {
	
	public static void main(String[] args) {
		
		Task task1 = new Task("RC", "2023-07-12");
		Task task2 = new Task("RC", "2023-09-29");
		Task task3 = new Task("RC", "2023-07-12");
		Task task4 = new Task("RC", "2023-07-12");
		Task task5 = new Task("RC", "2012-06-23");
		
		
		List<Task> tasks = new ArrayList<>();
		tasks.add(task1);
		tasks.add(task2);
		tasks.add(task3);
		tasks.add(task4);
		tasks.add(task5);
		
		HashSet<Task> uni = new HashSet<>();
		
		uni.addAll(tasks);
		
		for(Task i:uni) {
			
			System.out.println(i);
			
		}
		
		
	}
	
}