import java.util.*;
public class HashMap1 {
public static void main(String args[]) {
	//HashMap hm=new HashMap();
	//TreeMap hm=new TreeMap();
	LinkedHashMap hm=new LinkedHashMap();
	hm.put(1,"ashok");
	hm.put(2, "thota");
	hm.put(3, "yuvi");
	hm.put(5, "Sachin");
	hm.put(4, "dhoni");
	Set s=hm.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext()) {
		//System.out.println(i.next());
		Map.Entry me = (Map.Entry)i.next();
		System.out.println(me.getKey()+"#" +me.getValue());
	}
	hm.put(3, "bhuvi");
	System.out.println("The hashmap is "+hm);
	
}
}
