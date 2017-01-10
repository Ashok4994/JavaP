import java.util.*;
public class Cdemo {
public static void main(String args[]) {
	
	int values[]=new int[5];
	Object value1[]=new Object[5];
	value1[1]="ASHOK";
	value1[2]=10;
	value1[3]="SRIKANTH";
	 ArrayList c = new ArrayList();
	 c.add(3);
	 c.add("ASH");
	 c.add(4.5);
	 c.add(4.999);
	 Iterator i= c.iterator();
	 //System.out.println(i.next());
	 //System.out.println(i.next());
	 //System.out.println(i.next());
	/* while(i.hasNext()) {
		 
		 System.out.println(i.next());
	 }  */
	 
	 for(Object j:c) {
		 System.out.println(j);
	 }
	 
	 
}
	
}
