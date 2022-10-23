package Assinment2;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		Integer arr[] = { 1, 3, 4, 6, 2, 7, 5 };

		int temp = 0;
		for (int j = 0; j < arr.length-1; j++) {
			for (int i = 0; i < arr.length-j-1; i++) {
				if (arr[i ] > arr[i+1]) {
					temp = arr[i];
					arr[i ] = arr[i+1];
					arr[i+1] = temp;
				} 
			}
		}

		System.out.println(Arrays.toString(arr));


	}

}
//[1, 2, 3, 4, 5, 6, 7]

