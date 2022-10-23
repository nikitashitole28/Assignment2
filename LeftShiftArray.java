package Assinment2;

import java.util.Arrays;

public class LeftShiftArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		for (int i = 0; i < 3; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length-1] = temp;

		}
		
		System.out.println(Arrays.toString(arr));

	}

}
//[4, 5, 6, 7, 1, 2, 3]
