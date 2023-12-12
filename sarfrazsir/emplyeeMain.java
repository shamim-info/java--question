package sarfrazsir;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class emplyeeMain {

	public static void main(String[] args) {
		HashMap<Integer,Employee> dts=new HashMap<>();
         dts.put(1,new Employee("shami",23,20000,"Hr"));
         dts.put(2,new Employee("zahir",21,2333,"Er"));
         dts.put(3, new Employee("kohli",34,454444,"supervisor"));
         dts.put(4, new Employee("rahul",22,54321,"expert"));
         dts.put(5, new Employee("raj",28,54321,"expert"));
         dts.put(6, new Employee("kumar",22,54321,"doc"));
         dts.put(7, new Employee("ratan",24,54321,"consultant")); 
         dts.put(8, new Employee("roshan",26,54321,"mechanic"));
         dts.put(9, new Employee("abdullah",22,54321,"advisor"));
         dts.put(10, new Employee("risham",27,54321,"expert"));
         for(Map.Entry<Integer, Employee>ds:dts.entrySet() ) {
         System.out.println(dts);
        // System.out.println(Integer.MAX_VALUE);
        // Integer Max= Collection.max(dts);
	}

}
}