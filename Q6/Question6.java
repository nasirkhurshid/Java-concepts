package Q6;

public class Question6 {
	public static void main(String[] args) {
		String str;
		str = new String("1. Mississippi is a state in the Southeastern region of the United States!");

		int[] checker = new int[256];

		for (int i = 0; i < str.length(); i++) {
			checker[(int) str.charAt(i)]++;
		}

		for (int i = 0; i < checker.length; i++) {
			if (checker[i] > 0)
				System.out.println((char) i + " occured " + checker[i] + " time(s).");
		}
	}
}
