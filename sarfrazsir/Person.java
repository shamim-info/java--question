package sarfrazsir;

public class Person {
	String name ;
	int age;
	String address;
	

	public static void main(String[] args) {
		Person p= new Person();
		p.name="asad";
		p.age=23;
		p.address="purnia";
		Person p1=new Person();
		p1.name="hafsa";
		p1.age=4;
		p1.address="shimultola";
		Person p3=new Person();
		p3.name="raju";
		p3.age=32;
		p3.address="araria";
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p3);
	}

}
