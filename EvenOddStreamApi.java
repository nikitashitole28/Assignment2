package Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddStreamApi {

	public static void main(String[] args) {
		
		List<Integer> lst=Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> odd = lst.stream().filter(x->x%2!=0).collect(Collectors.toList());
         System.out.println("odd numbers "+ odd);
         
         List<Integer> even = lst.stream().filter(x->x%2==0).collect(Collectors.toList());
         System.out.println(" even numbers "+ even);
	}
	

}
// odd numbers [1, 3, 5, 7]
//even numbers [2, 4, 6]