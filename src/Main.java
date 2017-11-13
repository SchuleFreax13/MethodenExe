
public class Main {

	private static void leerzeichen(int anzahl) {
		for (int i = 0; i < anzahl; i++)
			System.out.print(' ');
	}

	private static void schreibeZeichen(char c, int anzahl) {
		for (int i = 0; i < anzahl; i++)
			System.out.print(c);
	}

	private static char machGross(char c) {
		return Character.toUpperCase(c);
	}

	private static double summe(int n) {
		double ret = 0;
		for (double i = 0; i < n; i++) {
			ret += 1 / i;
		}
		return ret;
	}

	private static double produkt(int n) {
		double ret = 0;
		for (double i = 0; i < n; i += 2) {
			ret += (n + 1D) / n;
			ret += (n + 1D) / (n + 1D);
		}
		return ret;
	}

	private static int fakultaet(int n) {
		int ret = 1;
		for (int i = 1; i < n; i++)
			n *= i;
		return ret;
	}

	private static int zeitDifferenz(double Zeit1, double Zeit2) {
		return (int) ((Zeit2 % 1) + (Zeit2 - (Zeit2 % 1)) * 60) - (int) ((Zeit1 % 1) + (Zeit1 - (Zeit1 % 1)) * 60);
	}

	private static boolean istSchaltjahr(int jahr) {
		return jahr % 400 == 0 ? true : jahr % 100 == 0 ? false : jahr % 4 == 0;
	}

	private static long ggT(long a, long b) {
		if (a == b | b == 0)
			return a;
		else
			return ggT(b, a % b);
	}

	private static long kgV(long a, long b) {
		return a * (b / ggT(a, b));
	}

	private static double sqrt(double x, double n) {
		double y = n / x;

		for (; Math.abs(x - y) > 0.01;) {
			y = (x + y) / 2;
			x = n / y;
		}
		return x;
	}

	private static boolean isPrime(int zahl) {
		if (zahl == 2)
			return false;
		final double sqrt = Math.sqrt(zahl);
		for (int i = 3; i < sqrt; i += 2)
			if (zahl % i == 0)
				return false;
		return true;
	}

	private static void printBin(int n) {
		boolean erster = false;
		for (int i = 31; i >= 0; i--) {
			if (!erster) {
				if ((n & (2 << i)) != 0) {
					System.out.print("1");
					erster = true;
				}
			} else {
				if ((n & (1 << i)) != 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
	}

}
