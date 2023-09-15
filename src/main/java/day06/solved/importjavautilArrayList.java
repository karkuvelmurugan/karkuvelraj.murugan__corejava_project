package day06.solved;
import java.util.*;
import java.util.ArrayList;

public class importjavautilArrayList {
    public static void main (String[] args) {
    	Collection<String> list = new ArrayList<>();
    	list.add("cse");
    	list.add("cse");
    	list.add("eee");
    	int cnt = Collections.frequency(list, "cse");
    	System.out.println(cnt);
    }
}
