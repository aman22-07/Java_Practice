package Fundamentals;

public class Variables {
	//Instance variables
	public int var=1234;
	String str="aman";
	
	static int x=10;
	
	void m1() {
		//Local Variables
		int var1=10;
		//public int var2=10; not works
		System.out.println(x+10);
		System.out.println("m1: "+var1);
		
		
	}
	void m2() {
		//Local Variables
		int var1=101;
		System.out.println("m2: "+var1);
	}
	static void m3() {
		//Local Variables
		int var1=101;
		//System.out.println("inatance : "+var); no works
		System.out.println("m3: "+var1);
	}

	public static void main(String[] args) {
		Variables obj=new Variables();
		Variables obj1=new Variables();
		obj.m1();
		obj.m2();	
		
		// static can be called directly with class name
		Variables.m3();
		obj1.m3();
	}

}
