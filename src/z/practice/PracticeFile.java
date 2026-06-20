package z.practice;

import java.text.Collator;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PracticeFile {


	public static void main(String[] args) {
		List<Integer> srcList =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,10,10);
//		List<Integer> oddnumbers =  srcList.stream().skip(5).collect(Collectors.toList());
		List<Integer> oddnumbers =  srcList.stream().distinct().collect(Collectors.toList());
		List<String> srcStringList = Arrays.asList("asd","qwe","zxc","mnb","lkj");
		//Filters
		oddnumbers =  srcList.stream().filter(n->n%2 !=0).collect(Collectors.toList());
		oddnumbers =  srcList.stream().filter(n->{
			if(n%2==0) {
//				System.out.println("n " + n);
				n=n+2;
				return true;
			}else {				
//				System.out.println("n " + n);	
				return false;
			}
		}).collect(Collectors.toList());
		
		//Maps
		oddnumbers =  srcList.stream().map(n->n+1).collect(Collectors.toList());
		oddnumbers =  srcList.stream().map(n->{
			return n+1;
		}).collect(Collectors.toList());
		//Maps Built-in Methods
		srcStringList = srcStringList.stream().map(String::toUpperCase).collect(Collectors.toList());
		String finalStr = srcStringList.stream().reduce("START",(a,b)->a+b);
//		System.out.println(oddnumbers);
//		System.out.println(finalStr);
		
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);
		
		
		// Sort in natural order (smallest to largest)
		List<Integer> ascending = numbers.stream()
			.sorted((a,b)->a-b)
			.collect(Collectors.toList());
		System.out.println(ascending);
	}

}
