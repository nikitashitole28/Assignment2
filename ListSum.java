package Assinment2;

import java.util.Arrays;
import java.util.List;

public class ListSum {

	public static void main(String[] args) {
		List<Integer> lst1=Arrays.asList(1,2,3,4,5);
		
		//approach1
int sum = lst1.stream().mapToInt(Integer::intValue).sum();
System.out.println(sum);
System.out.println();

//approach 2
Integer addition=0;
for(Integer num:lst1) {
	addition=addition+num;
}
System.out.println(addition);




	}

}
//15
