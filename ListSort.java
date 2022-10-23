package Assinment2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListSort {

	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(1,3,5,7,6,4,2);
List<Integer> sorted = lst.stream().sorted().collect(Collectors.toList());
System.out.println(sorted);
	}

}
//[1, 2, 3, 4, 5, 6, 7]