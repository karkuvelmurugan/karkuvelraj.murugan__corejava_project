package day06.practice;

import java.util.*;


public class ArrayToStoreTaskDetails {
	
	public static boolean findTaskByName(String name, ArrayList<Task> taskList) {
		
		boolean find = false;
		
		for(int i=0; i<taskList.size(); i++) {
			
			if(taskList.get(i).taskName.equals(name)) {
				
				find = true;
				break;
			}
			
		}
		
		return find;
		
	}
	
	public static void main(String[] args) {
	
	Task task1 = new Task("RC", 3);
	Task task2 = new Task("Test", 1);
	Task task3 = new Task("FOP", 2);

	
    ArrayList<Task> taskList = new ArrayList<Task>();
    
    taskList.add(task1);
    taskList.add(task2);
    taskList.add(task3);
    
    for(Task i:taskList) {
    	     	
    System.out.println(i);
    
    }
    
    System.out.print(findTaskByName("RC", taskList));
    
	}

}
