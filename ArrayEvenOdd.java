package Assinment2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		Integer arr1[] = { 1, 2, 3, 4, 5, 6, 7,8,9 };
//approach 1
		for(Integer num:arr1) {
			if(num%2==0) {
				System.out.println("even no="+num );
			}
			else {
				System.out.println("odd no="+num);
			}
		}
		
		
		//approach 2
		List<Integer> evenno = Arrays.stream(arr1).filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evenno);
		
		List<Integer> oddnos = Arrays.stream(arr1).filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(oddnos);
		
		
	}

}
