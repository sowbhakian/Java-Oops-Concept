package u.streamandfilter;

import java.util.*;

public class StreamAndFilter {
	public static void main(String args[]) {

		callStreamAndFilter();
	}


	private static void callStreamAndFilter() {		
		/*
		 *  A Stream is:A sequence of elements supporting functional-style operations 
		 * for processing data declaratively.
		 * 
		 * 
		 * Common sources: List, Set, Map, Arrays, Files
		 */
		
		ArrayList<Integer> intList = new ArrayList<Integer>( Arrays.asList(1,2,3,4,5)); 
		
		List<Integer> intLists = intList.stream().filter(i -> i>=2).toList();
		
		

	}
	
	
}
