package sarfrazsir;

import java.util.HashMap;
import java.util.Map;

public class employeeInfo {
    String name ;
    int age;
    int sallery;
    String company;
    
	
	
	
	public employeeInfo(String name, int age, int sallery, String company) {
		super();
		this.name = name;
		this.age = age;
		this.sallery = sallery;
		this.company = company;
	}

	public static void main(String[] args) {
		Map<Integer,employeeInfo> hs=new HashMap<>();
		hs.put(124,  new employeeInfo("raj",23,200,"hp"));
		hs.put(122,  new employeeInfo("rahim",24,2300,"hcl"));
		hs.put(112,  new employeeInfo("rajkundra",12,2000,"tcs"));
		hs.put(152,  new employeeInfo("yadav",25,2000,"dell"));
		hs.put(1122,  new employeeInfo("hafiz",26,2040,"infosys"));
		hs.put(162,  new employeeInfo("hamja",28,200,"wipro"));
		hs.put(222,  new employeeInfo("mir",29,2020,"hp"));
		hs.put(1,  new employeeInfo("taki",24,200,"jocky"));
		hs.put(2,  new employeeInfo("usmani",29,200,"honda"));
		hs.put(16,  new employeeInfo("rahat",21,200,"hero"));
		hs.put(3,  new employeeInfo("roshan",22,200,"htc"));
		hs.put(17,  new employeeInfo("ritj",26,2200,"samsung"));	
		hs.put(111,  new employeeInfo("kumar",25,240,"hp"));
		//hs.containsValue("yadav");
		System.out.println(hs);
		

	}

}
