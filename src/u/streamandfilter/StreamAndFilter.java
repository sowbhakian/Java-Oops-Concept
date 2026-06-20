package u.streamandfilter;

import java.util.*;
import java.util.stream.*;

/**
 * A comprehensive demonstration of Java Stream API operations.
 * Streams let you process collections of data in a clean, efficient way.
 * Think of it like a pipeline where data flows through and gets transformed.
 */
public class StreamAndFilter {
	/**
	 * Main method - runs all the stream examples.
	 * Uncomment any method call to see that specific example in action.
	 * @param args command line arguments
	 */
	public static void main(String args[]) {
		System.out.println("===== Java Streams and Filters Examples =====\n");
		
		// Uncomment to run specific examples
		filterExample();
		mapExample();
		flatMapExample();
		sortedExample();
		distinctExample();
		limitAndSkipExample();
		matchingExample();
		findExample();
		reduceExample();
		collectExample();
		countExample();
		minMaxExample();
		forEachExample();
		peekExample();
		groupingByExample();
	}

	/**
	 * FILTER - Keeps only items that pass a test.
	 * Like a bouncer at a club - only lets certain people through.
	 * 
	 * Example: From a list of numbers, keep only the even ones.
	 */
	private static void filterExample() {
		System.out.println("--- FILTER Example ---");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Keep only even numbers (numbers divisible by 2)
		List<Integer> evenNumbers = numbers.stream()
			.filter(n -> n % 2 == 0)
			.collect(Collectors.toList());
		
		System.out.println("Original: " + numbers);
		System.out.println("Even numbers only: " + evenNumbers);
		
		// Multiple filters can be chained
		List<Integer> evenAndGreaterThan5 = numbers.stream()
			.filter(n -> n % 2 == 0)
			.filter(n -> n > 5)
			.collect(Collectors.toList());
		System.out.println("Even AND greater than 5: " + evenAndGreaterThan5);
		System.out.println();
	}

	/**
	 * MAP - Transforms each item into something else.
	 * Like a factory assembly line - each item gets modified.
	 * 
	 * Example: Double each number, or convert strings to uppercase.
	 */
	private static void mapExample() {
		System.out.println("--- MAP Example ---");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		// Double each number
		List<Integer> doubled = numbers.stream()
			.map(n -> n * 2)
			.collect(Collectors.toList());
		
		System.out.println("Original: " + numbers);
		System.out.println("Doubled: " + doubled);
		
		// Convert strings to uppercase
		List<String> names = Arrays.asList("alice", "bob", "charlie");
		List<String> upperNames = names.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
		System.out.println("Names: " + names);
		System.out.println("Uppercase: " + upperNames);
		System.out.println();
	}

	/**
	 * FLATMAP - Flattens nested collections into one stream.
	 * Like unpacking boxes within boxes - everything gets laid out flat.
	 * 
	 * Example: If you have a list of lists, flatten them into one list.
	 */
	private static void flatMapExample() {
		System.out.println("--- FLATMAP Example ---");
		List<List<Integer>> nestedNumbers = Arrays.asList(
			Arrays.asList(1, 2, 3),
			Arrays.asList(4, 5, 6),
			Arrays.asList(7, 8, 9)
		);
		
		// Flatten the nested lists into one list
		List<Integer> flatList = nestedNumbers.stream()
			.flatMap(list -> list.stream())
			.collect(Collectors.toList());
		
		System.out.println("Nested: " + nestedNumbers);
		System.out.println("Flattened: " + flatList);
		
		// Another example: split sentences into words
		List<String> sentences = Arrays.asList("Hello World", "Java Streams");
		List<String> words = sentences.stream()
			.flatMap(sentence -> Arrays.stream(sentence.split(" ")))
			.collect(Collectors.toList());
		System.out.println("Sentences: " + sentences);
		System.out.println("All words: " + words);
		System.out.println();
	}

	/**
	 * SORTED - Arranges items in order.
	 * Like organizing books alphabetically or by size.
	 * 
	 * Example: Sort numbers from smallest to largest (or vice versa).
	 */
	private static void sortedExample() {
		System.out.println("--- SORTED Example ---");
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);
		
		// Sort in natural order (smallest to largest)
		List<Integer> ascending = numbers.stream()
			.sorted()
			.collect(Collectors.toList());
		
		// Sort in reverse order (largest to smallest)
		List<Integer> descending = numbers.stream()
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());

		// Using Comparator lambda function
		 descending = numbers.stream()
					.sorted((a,b)->a-b)
					.collect(Collectors.toList());
		 
		System.out.println("Original: " + numbers);
		System.out.println("Ascending: " + ascending);
		System.out.println("Descending: " + descending);
		
		// Sort strings by length
		List<String> words = Arrays.asList("apple", "pie", "banana", "kiwi");
		List<String> byLength = words.stream()
			.sorted(Comparator.comparing(String::length))
			.collect(Collectors.toList());
		System.out.println("Words: " + words);
		System.out.println("By length: " + byLength);
		System.out.println();
	}

	/**
	 * DISTINCT - Removes duplicates.
	 * Like removing duplicate photos from your camera roll.
	 * 
	 * Example: From [1,2,2,3,3,3], get [1,2,3].
	 */
	private static void distinctExample() {
		System.out.println("--- DISTINCT Example ---");
		List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5);
		
		List<Integer> uniqueNumbers = numbersWithDuplicates.stream()
			.distinct()
			.collect(Collectors.toList());
		
		System.out.println("With duplicates: " + numbersWithDuplicates);
		System.out.println("Unique only: " + uniqueNumbers);
		System.out.println();
	}

	/**
	 * LIMIT & SKIP - Take or skip a certain number of items.
	 * LIMIT: Like saying "I only want the first 3"
	 * SKIP: Like saying "Ignore the first 2, give me the rest"
	 * 
	 * Example: From a list, take only first 5 items, or skip first 3.
	 */
	private static void limitAndSkipExample() {
		System.out.println("--- LIMIT & SKIP Example ---");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Take only first 5
		List<Integer> firstFive = numbers.stream()
			.limit(5)
			.collect(Collectors.toList());
		
		// Skip first 3, get the rest
		List<Integer> skipThree = numbers.stream()
			.skip(3)
			.collect(Collectors.toList());
		
		// Skip 2, then take 3
		List<Integer> skipThenLimit = numbers.stream()
			.skip(2)
			.limit(3)
			.collect(Collectors.toList());
		
		System.out.println("Original: " + numbers);
		System.out.println("First 5: " + firstFive);
		System.out.println("Skip first 3: " + skipThree);
		System.out.println("Skip 2, take 3: " + skipThenLimit);
		System.out.println();
	}

	/**
	 * MATCHING - Check if items match certain conditions.
	 * anyMatch: "Does at least one item match?"
	 * allMatch: "Do ALL items match?"
	 * noneMatch: "Does NONE of them match?"
	 * 
	 * Example: Check if any number is even, or if all are positive.
	 */
	private static void matchingExample() {
		System.out.println("--- MATCHING Example ---");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
		boolean allPositive = numbers.stream().allMatch(n -> n > 0);
		boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
		
		System.out.println("Numbers: " + numbers);
		System.out.println("Has at least one even? " + hasEven);
		System.out.println("All positive? " + allPositive);
		System.out.println("None negative? " + noneNegative);
		System.out.println();
	}

	/**
	 * FIND - Find specific items from the stream.
	 * findFirst: Gets the first item
	 * findAny: Gets any item (useful in parallel streams)
	 * 
	 * Example: Find the first even number.
	 */
	private static void findExample() {
		System.out.println("--- FIND Example ---");
		List<Integer> numbers = Arrays.asList(1, 3, 5, 6, 7, 8);
		
		// Find first even number
		Optional<Integer> firstEven = numbers.stream()
			.filter(n -> n % 2 == 0)
			.findFirst();
		
		// Find any even number
		Optional<Integer> anyEven = numbers.stream()
			.filter(n -> n % 2 == 0)
			.findAny();
		
		System.out.println("Numbers: " + numbers);
		System.out.println("First even: " + (firstEven.isPresent() ? firstEven.get() : "None"));
		System.out.println("Any even: " + (anyEven.isPresent() ? anyEven.get() : "None"));
		System.out.println();
	}

	/**
	 * REDUCE - Combine all items into a single result.
	 * Like adding up all numbers, or concatenating all strings.
	 * Think of it as "reducing" many items down to one.
	 * 
	 * Example: Sum all numbers, or find the maximum.
	 */
	private static void reduceExample() {
		System.out.println("--- REDUCE Example ---");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		// Sum all numbers, first param as 0, the base number to be added with the list
		int sum = numbers.stream()
			.reduce(0, (a, b) -> a + b);
		
		// Multiply all numbers
		int product = numbers.stream()
			.reduce(1, (a, b) -> a * b);
		
		// Find maximum
		Optional<Integer> max = numbers.stream()
			.reduce((a, b) -> a > b ? a : b);
		
		System.out.println("Numbers: " + numbers);
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
		System.out.println("Max: " + (max.isPresent() ? max.get() : "None"));
		System.out.println();
	}

	/**
	 * COLLECT - Gather stream results into a collection.
	 * This is how you convert your stream back into a List, Set, or Map.
	 * 
	 * Example: Collect filtered numbers into a List or Set.
	 */
	private static void collectExample() {
		System.out.println("--- COLLECT Example ---");
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		
		// Collect to List
		List<Integer> list = numbers.stream()
			.filter(n -> n > 2)
			.collect(Collectors.toList());
		
		// Collect to Set (removes duplicates automatically)
		Set<Integer> set = numbers.stream()
			.collect(Collectors.toSet());
		
		// Collect to Map
		Map<Integer, String> map = numbers.stream()
			.distinct()
			.collect(Collectors.toMap(n -> n, n -> "Number_" + n));
		
		System.out.println("Original: " + numbers);
		System.out.println("To List (>2): " + list);
		System.out.println("To Set: " + set);
		System.out.println("To Map: " + map);
		System.out.println();
	}

	/**
	 * COUNT - Count how many items are in the stream.
	 * Simple as it sounds - counts the elements.
	 * 
	 * Example: Count how many even numbers there are.
	 */
	private static void countExample() {
		System.out.println("--- COUNT Example ---");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		long totalCount = numbers.stream().count();
		long evenCount = numbers.stream().filter(n -> n % 2 == 0).count();
		long oddCount = numbers.stream().filter(n -> n % 2 != 0).count();
		
		System.out.println("Numbers: " + numbers);
		System.out.println("Total count: " + totalCount);
		System.out.println("Even count: " + evenCount);
		System.out.println("Odd count: " + oddCount);
		System.out.println();
	}

	/**
	 * MIN & MAX - Find the smallest or largest item.
	 * 
	 * Example: Find the minimum and maximum number in a list.
	 */
	private static void minMaxExample() {
		System.out.println("--- MIN & MAX Example ---");
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3, 7);
		
		Optional<Integer> min = numbers.stream().min(Integer::compareTo);
		Optional<Integer> max = numbers.stream().max(Integer::compareTo);
		
		System.out.println("Numbers: " + numbers);
		System.out.println("Minimum: " + (min.isPresent() ? min.get() : "None"));
		System.out.println("Maximum: " + (max.isPresent() ? max.get() : "None"));
		System.out.println();
	}

	/**
	 * FOREACH - Do something with each item (but don't collect results).
	 * Like going through your shopping list and crossing off each item.
	 * This is a "terminal" operation - it ends the stream.
	 * 
	 * Example: Print each number.
	 */
	private static void forEachExample() {
		System.out.println("--- FOREACH Example ---");
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		
		System.out.print("Names: ");
		names.stream().forEach(name -> System.out.print(name + " "));
		System.out.println();
		
		System.out.println("Squared numbers:");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream()
			.map(n -> n * n)
			.forEach(n -> System.out.print(n + " "));
		System.out.println("\n");
	}

	/**
	 * PEEK - Look at each item as it passes through (for debugging).
	 * Like a window in your pipeline - you can see what's flowing through.
	 * Doesn't change the items, just lets you observe them.
	 * 
	 * Example: See items before and after transformation.
	 */
	private static void peekExample() {
		System.out.println("--- PEEK Example ---");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> result = numbers.stream()
			.peek(n -> System.out.println("Before filter: " + n))
			.filter(n -> n % 2 == 0)
			.peek(n -> System.out.println("After filter: " + n))
			.map(n -> n * 2)
			.peek(n -> System.out.println("After map: " + n))
			.collect(Collectors.toList());
		
		System.out.println("Final result: " + result);
		System.out.println();
	}

	/**
	 * GROUPING BY - Group items into categories.
	 * Like sorting your clothes into piles - shirts, pants, socks.
	 * 
	 * Example: Group numbers by odd/even, or students by grade.
	 */
	private static void groupingByExample() {
		System.out.println("--- GROUPING BY Example ---");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Group by odd/even
		Map<String, List<Integer>> groupedByType = numbers.stream()
			.collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
		
		System.out.println("Numbers: " + numbers);
		System.out.println("Grouped by Even/Odd: " + groupedByType);
		
		// Group strings by length
		List<String> words = Arrays.asList("a", "bb", "ccc", "dd", "eee", "f");
		Map<Integer, List<String>> groupedByLength = words.stream()
			.collect(Collectors.groupingBy(String::length));
		
		System.out.println("\nWords: " + words);
		System.out.println("Grouped by length: " + groupedByLength);
		System.out.println();
	}
}
