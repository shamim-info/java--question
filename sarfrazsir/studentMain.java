package sarfrazsir;

import java.util.*;
import java.util.Map;

public class studentMain {

	public static void main(String[] args) {
		HashMap<Integer,studentInfo> info=new HashMap<>();
		info.put(1,new studentInfo(123,89.2));
		info.put(3,new studentInfo(124,99.5));
		info.put(2,new studentInfo(125,99.2));
		info.put(8,new studentInfo(126,59.2));
		info.put(90,new studentInfo(121,79.2));
		info.put(111,new studentInfo(232,89.29));
		info.put(15,new studentInfo(11,85.7));
		info.put(112,new studentInfo(236,89.72));
		for(Map.Entry<Integer,studentInfo>ds:info.entrySet() ) {
		
		
	System.out.println(" key:-"+ ds.getKey()+"  roll number:-  "+ds.getValue().rollNumber +"  marks:- "+ds.getValue().marks);
		}
	}
}


