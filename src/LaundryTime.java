class Wash<T>
{
	T item;
	public void clean(T item)
	{
		System.out.println("clean"+item);
	}
}
public class LaundryTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Wash wash=new Wash();
		
		//Wash wash=new Wash<String>();
		Wash<String> wash=new Wash<>();
		wash.clean("socks");
		
	}

}
