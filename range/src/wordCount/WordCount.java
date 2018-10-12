package wordCount;
import java.util.*;

public class WordCount {
	public static void main(String[] args) {
		System.out.println("please input a sentence:");
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] arr = line.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {
				int num = map.get(arr[i]);
				map.put(arr[i], ++num);
			}
		}
		System.out.println("result as:");
		Set<String> set = map.keySet();
		for(Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String key = iterator.next();
			Integer n = map.get(key);
			System.out.println(key + "=" + n);
		}
	}
}
