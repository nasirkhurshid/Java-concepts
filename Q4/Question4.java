package Q4;

import java.util.Arrays;

public class Question4 {
	public static int[][] transpose(int[][] arr) {
		int[][] res = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				res[j][i] = arr[i][j];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 2, 3, 5, 1 }, { 9, 5, 1, 6 }, { 4, 3, 5, 8 } };
		System.out.println("Original Matrix:");
		for (int row[] : array) {
			System.out.println(Arrays.toString(row));
		}

		int[][] transposed = transpose(array);
		System.out.println("\nMatrix after Transpose: ");
		for (int row[] : transposed) {
			System.out.println(Arrays.toString(row));
		}
	}
}
