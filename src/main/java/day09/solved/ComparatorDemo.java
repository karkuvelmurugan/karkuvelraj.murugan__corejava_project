package day09.solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorDemo {
	public static void main(String args[]) {

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by age");

		Collections.sort(al, new AgeComparator());
		// Getting an Iterator for the List
		// Another way to iterate instead of foreach
		Iterator<Student> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by Name");

		Collections.sort(al, new NameComparator());
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}
}
