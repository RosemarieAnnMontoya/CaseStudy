public class Calculator {
	private int numA;
	private int numB;
	private double ans;
	
	public Calculator () {
		this(4,2);
	}
	public Calculator (int numA) {
		this(6.0,3.0);
	}
	public Calculator (int numA, int numB) {
	ans=numA-numB;
	}
	public Calculator (double numA, double numB) {
	ans=numA+numB;
	}
	public int getAns () {
		return (int)ans;
	}
	public double getAns (int n) {
		if (n==0)
			return ans+ans;
		else
			return ans*ans;
            
	}
	}