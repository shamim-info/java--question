package sarfrazsir;

interface shape{
	 void GetArea();

}
 class rectangle implements shape{

	@Override
	public void GetArea() {
		int a;int b;int c;
		a=10;b=20;
		c=a*b;
		System.out.println(c);
	}
	
}
 class Circle implements shape{
	 @Override
	public void GetArea() {
		double pi=3.14;
		int r=4;
		int area;
		area=(int) (pi*r*r);
		System.out.println( "area of circle"+area);
	}
}
 class Triangle implements shape{

	@Override
	public void GetArea() {
		int a,b,c,sp;double area; 
		a=12;
		b=15;
		c=10;
		sp=(a+b+c)/2;
		area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		System.out.println(sp);
		
	}
	 
	
	 }
 
 
 
 
 
 
 
 
 
 