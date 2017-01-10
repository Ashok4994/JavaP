import java.util.ArrayList;
import java.util.Iterator;
public class Cdemo1 {
public static void main(String args[]) {
	
	int values[]=new int[5];
	Object value1[]=new Object[5];
	value1[1]="ASHOK";
	value1[2]=10;
	value1[3]="SRIKANTH";
	 ArrayList<Integer> c = new ArrayList<Integer>();
	 c.add(3);
	 //c.add("ASH");
	 //c.add(4.5);
	 //c.add(4.999);
	 c.add(100);
	 c.add(200);
	 Iterator i= c.iterator();
	
	 for(Integer j:c) {
		 System.out.println(j);
	 }
	 
	 
}
	
}
