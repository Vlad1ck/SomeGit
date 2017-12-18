import java.util.Random;

public class Tester {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		System.out.println("Hellow world");
		second scnd = new second("Cобачка бежала");
		int x = rnd.nextInt(2);
		if(x == 1) scnd.demon();
		if(x == 0) System.out.println("Pedro was here today");
	}
	
}
