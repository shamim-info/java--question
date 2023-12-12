package sarfrazsir;

public class Maths {
  void add(int a,int b)
  {
	  System.out.println(a+b);
	  
  }
  void multi(int a,int b) 
  {
	  System.out.println(a*b);
  }


	public static void main(String[]args) {
		Maths r=new Maths();
		r.add(12, 13);
		r.multi(10, 5);
		System.out.println(r);
	}
}