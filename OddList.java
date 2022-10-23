package Assinment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddList {

	public static void main(String[] args) {
		//approach1
List<Integer> lst=Arrays.asList(1,2,3,4,5,6,7);
List<Integer> oddlist = lst.stream().filter(x->x%2!=0).collect(Collectors.toList());
System.out.println(oddlist);


//approach2
List<Integer> lst2=new ArrayList<>();
for(int i=0;i<lst.size();i++) {
	if(lst.get(i)%2!=0) {
		lst2.add(lst.get(i));
	}
}
System.out.println(lst2);




	}

}
//[1, 3, 5, 7]