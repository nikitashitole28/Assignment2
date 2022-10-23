package Assinment2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SameElementArray {

	public static void main(String[] args) {
		Integer arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
		Integer arr2[] = { 1, 2, 3, 40, 50, 60, 70 };

		// approach 1
		for (Integer a1 : arr1) {
			for (Integer a2 : arr2) {
				if (a1 == a2) {
					System.out.print(a1+" ");
				}
			}
		}

		
		System.out.println();
		
		//approach 2
		List<Integer> lst1=Arrays.asList(arr1);
		List<Integer> lst2=Arrays.asList(arr2);
		
		List<Integer> collect = lst1.stream().filter(lst2::contains).collect(Collectors.toList());
		System.out.println(collect);
		
		}

}
//1 2 3 
//[1, 2, 3]