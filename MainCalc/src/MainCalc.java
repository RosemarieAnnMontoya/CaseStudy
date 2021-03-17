
public class MainCalc {
	public static void main (String args[]) {
		Calculator c1= new Calculator();
		Calculator c2= new Calculator(1);
		Calculator c3= new Calculator(2,3);
		Calculator c4= new Calculator(4.0,5.0);
		Calculator c5= new Calculator(3.5,1.3);
		System.out.println("Programmed by : C Syron Toting");
		System.out.println (c1.getAns());
		System.out.println (c1.getAns(10));
		System.out.println (c2.getAns());
		System.out.println (c2.getAns(10));
		System.out.println (c3.getAns());
		System.out.println (c3.getAns(10));
		System.out.println (c4.getAns());
		System.out.println (c4.getAns(10));
		System.out.println (c5.getAns());
	}
}