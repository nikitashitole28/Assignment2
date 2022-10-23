package Assinment2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		String str = "nikita";

//approach 1
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		System.out.println();
		
		//approach 2
		StringBuffer sb=new StringBuffer(str);
		//StringBuilder ss=new StringBuilder(str);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
		
		//approach 3
		List<StringBuffer> collect = Stream.of(str).map(x->new StringBuffer(x).reverse()).collect(Collectors.toList());
		
		System.out.println(collect);
	}

}

//atikin
//atikin
//[atikin]

