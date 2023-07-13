package Q3;

import java.util.Arrays;
import java.util.Collections;

public class Question3 {
	public static void main(String[] args) {
		Integer[] array = { 21, 34, 15, 7, 43, 87, 53, 27, 91, 44 };
		System.out.println("Printing Array: " + Arrays.toString(array));

		// finding minimum
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		System.out.println("Minimum value in Array is: " + min);

		// finding maximum
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("Maximum value in Array is: " + max);

		Arrays.sort(array);
		System.out.println("Sorted Array in ascending order: " + Arrays.toString(array));

		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Sorted Array in descending order: " + Arrays.toString(array));
	}
}
