import java.util.LinkedList;
import java.util.*;

public class IteratorDemo {
	public static void main(String args[]) {
		ArrayList l=new ArrayList();
		l.add(2);
		l.add(2);
		l.add(2);
		l.add(2);
		l.add(2);
		l.add(3);
		l.add(2);
		//System.out.println("Linked list is"+l);
		Iterator i=l.iterator();
		while(i.hasNext()) {
			Object ele=i.next();
			if(ele=="2") {
				i.remove();
			}
			System.out.println(ele+" ");
			
		}
	}

}
