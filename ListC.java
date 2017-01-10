
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
public class ListC {
public static void main(String args[]) {
	
	/*int values[]=new int[5];
	Object value1[]=new Object[5];
	value1[1]="ASHOK";
	value1[2]=10;
	value1[3]="SRIKANTH"; */
	 List<Integer> values = new ArrayList<Integer>();
	 values.add(3);
	 values.add(100);
	 values.add(200);
	 values.add(2,50);     //List extra.......
	 Collections.sort(values);
	 Collections.reverse(values);
	 Iterator i= values.iterator();
	
	 for(Integer j:values) {
		 System.out.println(j);
	 }
	 
	 
}
	
}

