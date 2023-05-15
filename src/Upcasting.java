class A
{
	public void show()
	{
		System.out.println("show method");
	}
	public static void run()
	{
		System.out.println("run 3 kms mrng");
	}
	
}
class B extends A
{
	public void show()
	{
		System.out.println("show the overiden method");
	}
	
}
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a =new B();  //upcasting
		a.show();
		A.run();
		B b=(B)a;  //downcasting
		b.show();
		B.run();
		//A a1=new A();
		
		

	}

}
