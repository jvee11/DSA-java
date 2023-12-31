package Lec15;

public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		System.out.println(searchMatrix(arr, 17));

	}

	public static boolean searchMatrix(int[][] arr, int target) {
		int row = 0;
		int col = arr[0].length - 1;
		while (row < arr.length && col >= 0) {

			if (arr[row][col] == target) {
				return true;
			} else if (arr[row][col] > target) {
				col--;
			} else {
				row++;
			}
		}
		return false;

	}

}
