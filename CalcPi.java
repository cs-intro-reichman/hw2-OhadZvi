// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int repitions = Integer.parseInt(args[0]);
		int sign = 1;
		int m = 1;
		double pi = 0;
		for (int i = 0; i < repitions; i++) {
			pi += ((double)sign/m);
			m += 2;
			sign *= -1;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + pi * 4);
	}
}
