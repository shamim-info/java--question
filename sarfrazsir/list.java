package sarfrazsir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class list {

	public static void main(String[] args) {
		ArrayList<Integer> lst=new ArrayList <>();
         lst.add(234);
         lst.add(134);
         lst.add(334);
         lst.add(345);
         lst.add(434); 
         lst.add(5534);
         Iterator<Integer> Iterator=lst.iterator();
         while(Iterator.hasNext());
         System.out.println(Iterator.next());
         Integer max = Collections.max(lst);
	}

}
