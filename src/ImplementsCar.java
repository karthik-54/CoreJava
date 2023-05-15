
public class ImplementsCar implements Car{

	@Override
	public int drive(int n) {
		// TODO Auto-generated method stub
		System.out.println("Driving...");
		return n;
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("playing music");
	}

}
