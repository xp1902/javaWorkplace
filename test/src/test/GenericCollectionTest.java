package test;

import java.util.*;
import java.util.stream.*;

public class GenericCollectionTest {
	public static void main(String[] args) {
		//test lists-------------------------------------------------------------------------------------------------------
		String[] colors = {"Magenta", "Red", "White", "Blue", "Cyan"};
		List<String> list = new ArrayList<String>();
		for(String c: colors) {
			list.add(c);
		}
		//replaced with below statement
		//Collections.addAll(list, colors);
		String[] removeColors = {"Red", "White", "Blue"};
		List<String> removeList = new ArrayList<String>();
		for(String c: removeColors) {
			removeList.add(c);
		}
		System.out.println("ArrayList:");
		list.stream().forEach(System.out::println);
		
		removeColors(list, removeList);
		System.out.printf("%nArrayList after calling removeColors:%n");
		list.stream().forEach(System.out::println);
		
		System.out.println("----------------------------------------------------------------------------------");;
		
		//demo 2 LinkedList
		String[] colors2 = {"black", "yellow", "green", "blue", "violet", "silver"};
		List<String> list1 = new LinkedList<String>();
		for(String c: colors2) 
			list1.add(c);
			//could replace with the below statement;
			//	LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(colors));
		String[] colors3 = {"gold", "white", "brown", "blue", "gray", "silver"};
		List<String> list2 = new LinkedList<String>();
		for(String c: colors3)
			list2.add(c);
		list1.addAll(list2);
		list2 = null;
		printList(list1);
		
		convertToUppercaseString(list1);
		printList(list1);
		
		System.out.println("%nDeleting element 4 to 6");;
		removeItems(list1, 4, 7);
		printList(list1);
		printReversedList(list1);
		
		//collection method
		//1.sort
		Collections.sort(list2, Collections.reverseOrder());
		//2.shuffle
		Collections.shuffle(list2);
		//3.reverse, copy, max, min;
		Collections.copy(list1, list2);
		Collections.fill(list1, "R");
		String min = Collections.min(list1);
		String max = Collections.max(list1);
		//4.binarySearch
		int reslut = Collections.binarySearch(list1, "black");
		//5.addAll, frequency, disjoint
		boolean disjoint = Collections.disjoint(list1, list2);
		//test stack--------------------------------------------------------------------------------------------------
		
		
		//test queue
		//test set
		//test map
		
	}

	private static void printReversedList(List<String> list1) {
		// TODO Auto-generated method stub
		ListIterator<String> it = list1.listIterator(list1.size());
		System.out.println("reversed List:");
		while(it.hasPrevious())
			System.out.println(it.previous());
		
//		Stream.of(list1).forEach((l) -> Collections.reverse(l));
	}

	private static void removeItems(List<String> list1, int i, int j) {
		// TODO Auto-generated method stub
		list1.subList(i,  j).clear();
	}

	private static void convertToUppercaseString(List<String> list1) {
		// TODO Auto-generated method stub
		list1.stream().forEach(String::toUpperCase);
	}

	private static void printList(List<String> list1) {
		// TODO Auto-generated method stub
		System.out.printf("%nlist:%n");
		list1.stream().forEach(System.out::println);
	}

	private static void removeColors(Collection<String> list, Collection<String> removeList) {
		// TODO Auto-generated method stub
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if(removeList.contains(it.next()))
				it.remove();
		}
	}
}
