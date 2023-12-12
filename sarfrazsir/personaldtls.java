package sarfrazsir;

public class personaldtls {

	public static void main(String[] args) {
			PersonnalDetails ds=new PersonnalDetails();
			ds.setId(123);
			ds.setName("shah");
			ds.setLocation("purnia");
		    ds.setAddress("girja chowk");
		    ds.setAge(23);
		    System.out.println(ds.getId()+ds.getName()+ds.getLocation()+ds.getAddress()+ds.getAge());

	}

}
