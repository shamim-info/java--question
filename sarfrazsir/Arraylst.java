package sarfrazsir;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylst {

	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<>();
         num.add(2346);
         num.add(2384);
         num.add(2394);         
         num.add(7234);
         num.add(2034);
         num.add(20034);
         num.add(23774);
         System.out.println(num);
         num.remove(3);
         System.out.println(num);
         //  to chek if the element exissts 
         num.indexOf(8);
         num.contains(2);
         System.out.println(num);
         Iterator<Integer> Iterator=num.iterator();
         while(Iterator.hasNext());
        	System.out.println((Iterator.next())); 
         }
	

}


