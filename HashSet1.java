import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet1 {
	
	public static void main(String args[]) {
		HashSet<Integer> h1=new HashSet();
		
		//LinkedHashSet<Integer> h=new LinkedHashSet();
		TreeSet h=new TreeSet();
		h1.add(1);
		h1.add(11);
		h1.add(21);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(7);
		h.add(5);
		h.add(4);
		h.add(1);
		h.addAll(h1);
		h.remove(3);
		System.out.print("Hash set elements are:"+h);
		
	}

}
