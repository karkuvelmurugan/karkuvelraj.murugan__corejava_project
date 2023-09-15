package day07.solved;

import java.util.*;

//class HashCodeEqualsDemo {
//
//	int id;
//
//	public HashCodeEqualsDemo(int id) {
//		this.id = id;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		HashCodeEqualsDemo other = (HashCodeEqualsDemo) obj;
//		if (id != other.id)
//			return false;
//		return true;
//	}
//
//}

public class HashCodeEqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        HashCodeEqualsDemo emp1 = new HashCodeEqualsDemo(23);
        HashCodeEqualsDemo emp2 = new HashCodeEqualsDemo(23);
 
        System.out.println("emp1.equals(emp2)--->>>" + emp1.hashCode());
        System.out.println("emp1.equals(emp2)--->>>" + emp2.hashCode());
        System.out.println("emp1.equals(emp2)--->>>" + emp1.equals(emp2));
 
        ArrayList<HashCodeEqualsDemo> empList = new ArrayList<HashCodeEqualsDemo>();
        empList.add(emp1);
        empList.add(emp2);
        System.out.println("ArrayList size:" + empList.size());
 
        HashSet<HashCodeEqualsDemo> setOfEmps = new HashSet<>();
        setOfEmps.add(emp1);
        setOfEmps.add(emp2);
 
        for (HashCodeEqualsDemo emp : setOfEmps) {
            System.out.println(emp);
        }
 
        System.out.println("HashSet size:" + setOfEmps.size());
 
	}
	
}