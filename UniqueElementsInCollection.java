//Java Program to find all numbers that occur exactly once in input collection.
//If input is {1,2,1,3} it should return 2,3

import java.util.*;
public class MyClass {
    
    public static Collection<Integer> findUnique(Collection<Integer> numbers) {
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    int j;
    for(int i:numbers) {
        hm.put(i,0);
    }
    for(int i:numbers) {
    if(hm.get(i)==1) {
    //j=hm.get(i);
    //hm.put(i,++j);
    hm.remove(i);   
    //System.out.println("j="+j);
    }
    else
      hm.put(i,1);
  }
  Set s=hm.keySet();
    System.out.println(hm);
     return s;    
    }
    public static void main(String args[]) {
     Collection<Integer> numbers = Arrays.asList(1,2,1,3);
     for(int number: findUnique(numbers))
         System.out.println(number);
    }
}
