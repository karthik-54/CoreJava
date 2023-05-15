class Latha
{
	public int a;
	public String name;
	public Latha()
	{
		System.out.println("super class constructor");
	}
	Latha(int n)
	{
		this();
		System.out.println("super class constructor:n");
	}
}
class Karthik extends Latha
{
	public Karthik(int a,String name)
	{
		super(5);
		this.a=a;
		this.name=name;
		System.out.println("age is "+a+" name is "+name);
	}
	
}
public class ConstructorWithArgWithoutArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Karthik b=new Karthik(45,"karthik");

	}

}
