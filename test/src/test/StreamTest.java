package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	private static int length(final String name) {
        System.out.println("getting length for " + name);
        return name.length();
    }
    private static String toUpper(final String name ) {
        System.out.println("converting to uppercase: " + name);
        return name.toUpperCase();
    }
	public static void main(String[] args) throws IOException {
		List<String> names = Arrays.asList("Brad", "Kate", "Kim", "Jack", "Joe", "Mike", "Susan", "George", "Robert", "Julia", "Parker", "Benson");

//        final String firstNameWith3Letters = names.stream()
//            .filter(name -> length(name) == 3)
//            .map(name -> toUpper(name))
//            .findFirst()
//            .get();
//        System.out.println(firstNameWith3Letters);
		//testing map-----------------------------------------------
		List<String> output = names.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(output);
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		List<Integer> squareNums = nums.stream()
				.map(n -> n * n)
				.collect(Collectors.toList());
		System.out.println(squareNums);
		
		Stream<List<Integer>> inputStream = Stream.of(
				 Arrays.asList(1),
				 Arrays.asList(2, 3),
				 Arrays.asList(4, 5, 6)
		);
		Stream<Integer> outputStream = inputStream.
		flatMap(childList -> childList.stream());
		List<Integer> l = outputStream.collect(Collectors.toList());
		System.out.println(l);
		
		//testing filter------------------------------------------------
		Integer[] sixNums = {1, 2, 3, 4, 5, 6};
		Integer[] evens = Stream.of(sixNums)
				.filter(x -> x % 2 == 0)
				.toArray(Integer[]::new);
		System.out.printf("%d%n", evens.length);
		System.out.println(evens);
		//testing peek------------------------------------------------------------
		Stream.of("one", "two", "three", "four")
			.filter(e -> e.length() >= 3)
			.peek(e -> System.out.println("Filtered value:" + e))
			.map(String::toUpperCase)
			.peek(e -> System.out.println("Mapped value:" + e))
			.collect(Collectors.toList());
		//testing reduce------------------------------------------------------
		String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
		double minValue = Stream.of(-1.5, 2.0, -3.0).reduce(Double.MAX_VALUE, Double::min);
		int sumValue = Stream.of(1, 2, 3, 4).reduce(Integer::sum).get();
		concat = Stream.of("a", "B", "c", "D", "e", "F")
				.filter(x -> x.compareTo("Z") < 0)
				.reduce("", String::concat);
		System.out.printf("%s%n%.2f%n%d", concat, minValue, sumValue);
		//testing max to file operation-------------------------------------
//			BufferedReader br = new BufferedReader(new FileReader("c:\\SUService.log"));
//			int longest = br.lines().
//				 mapToInt(String::length).
//				 max().
//				 getAsInt();
//			br.close();
//			System.out.println(longest);
		//sorted------------------------------------------
		Stream.of(1, 2, 4, 5, 3)
				.sorted((x, y) -> x .compareTo(y))
				.forEachOrdered(x -> System.out.println(x));
		//limit-----skip----------------------------------
		//max----min----distinct-----------------------
		//match------------------------------------------
		List<String> persons = new ArrayList();
		persons.add("name" + 1);
		persons.add("name" + 2);
		persons.add("name" + 3);
		persons.add("name" + 4);
		persons.add("name" + 5);
		boolean isAllAdult = persons.stream().
				allMatch(p -> p.indexOf(3, 4) > 3);
		System.out.println("All are adult? " + isAllAdult);
		boolean isThereAnyChild = persons.stream().
		 anyMatch(p -> p.indexOf(3, 4) < 1);
		System.out.println("Any child? " + isThereAnyChild);
		//personal supplier to test generate-----------
		Random seed = new Random();
		Supplier<Integer> random = seed::nextInt;
		Stream.generate(random).limit(10).map(x -> x % 100).forEach(System.out::println);
			//Another way
		IntStream.generate(() -> (int) (System.nanoTime() % 100)).limit(10).forEach(System.out::println);
		
		//iterator testing
		Stream.iterate(0, n -> n +3).limit(10).forEach(x -> System.out.print(x + " "));
		
		//groupintBy/partitioningBy testing
		Integer[] a = {1, 2, 3, 4};
		Stream.of(a).forEach(System.out::println);;
	}
}
