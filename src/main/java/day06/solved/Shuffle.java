package day06.solved;
import java.util.List;
import java.util.*;

public class Shuffle {
	public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
