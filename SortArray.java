package Assinment2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {

	public static void main(String[] args) {
		Integer arr[] = { 1, 3, 4, 6, 2, 7, 5 };
		List<Integer> lst = Arrays.asList(arr);

//approach 1
		List<Integer> sorted = lst.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);

//approach 2
		int temp = 0;
		for (int j = 0; j < arr.length-1; j++) {
			for (int i = 0; i < arr.length-j-1; i++) {
				if (arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				} 
			}
		}

		System.out.println(Arrays.toString(arr));

		// approach 3
		Collections.sort(lst);
		System.out.println(lst);

	}

}
//[1, 2, 3, 4, 5, 6, 7]
//[1, 2, 3, 4, 5, 6, 7]
//[1, 2, 3, 4, 5, 6, 7]