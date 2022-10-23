package Assinment2;

import java.util.Arrays;

public class SumArr {

	public static void main(String[] args) {
		//approach 1
		Integer arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int addition = 0;
		for (Integer num : arr1) {
			addition = addition + num;
		}
		System.out.println(addition);

		//approach 2
		int sum = Arrays.stream(arr1).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
			}

}
