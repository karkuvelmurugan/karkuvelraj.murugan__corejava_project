package day06.practice;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateFromTheArrayList {
	
	public static void main(String[] args) { 

	List<String> cityList = new ArrayList<String>();
	cityList.add("Chennai");
	cityList.add("Bangalore");
	cityList.add("Mumbai");
	cityList.add("Mumbai");
	
	
	 /////   METHOD  I
	
	Set<String> set = new HashSet<>(cityList.size());
	cityList.removeIf(p -> !set.add(p));
	
	System.out.println(cityList);
	
	/////  METHOD II
	
	List<String> listWithoutDuplicates = cityList.stream().distinct().collect(Collectors.toList());

	System.out.println(listWithoutDuplicates);
	
	}
	
	 List<String> uniqueCityList = new ArrayList<>();
     // Loop through the original cityList
     for (String cit : cityList) {
         // If uniqueCityList doesn't contain the city, add it to the list
         if (!uniqueCityList.contains(cit)) {
             uniqueCityList.add(cit);
         }
     }
     // Print the unique city names
     for (String cit : uniqueCityList) {
         System.out.println(cit);
     }

	
}