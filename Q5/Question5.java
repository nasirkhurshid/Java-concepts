package Q5;

public class Question5 {
	public static String reverseIteratively(String str) {
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s += str.charAt(i);
		}
		return s;
	}

	public static String reverseRecursively(String str) {
		if (str.isEmpty())
			return str;
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String str = "Iteration";
		String reversed;
		reversed = reverseIteratively(str);
		System.out.println("Reversed Iteratively: " + reversed);

		str = "Recursion";
		reversed = reverseRecursively(str);
		System.out.println("Reversed Recursively: " + reversed);
	}
}
