package sarfrazsir;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HASHMAPP {

	public static void main(String[] args) {
	 HashMap<Integer,String>store=new HashMap<>();
      store.put(2, "java");
      store.put(26, "python");
      store.put(23, "javascript");
      store.put(12, "ccc");
      store.put(21, "css");
      
      
      String value="ccc";
      for(Map.Entry<Integer,String> entry:store.entrySet()) {
    	  if (value.equals(entry.getValue())) {
    		  System.out.println("key: " + entry.getKey());
    		  break;
    		  
    		  
    		  
    	  }
      }
      
	}

}
