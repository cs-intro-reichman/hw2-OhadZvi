// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int finalSeed = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		int seed = 1;
		if (mode == 'v') {
			while (seed <= finalSeed) {
				System.out.print(seed + " ");
				int nextElem = seed;
				int counter = 1;
				boolean flag = true;
				while (flag) {
					if (nextElem % 2 == 0) {
						nextElem = nextElem / 2;
					}
					else {
						nextElem = nextElem * 3 + 1;
					}
					if (nextElem == 1) {
						flag = false;
					}
					System.out.print(nextElem + " ");
					counter++;
				}
				System.out.println("(" + counter + ")");
				seed++;
			}
		}
		System.out.println("Every one of the first " + finalSeed + " hailstone sequences reached 1");
	}
}
