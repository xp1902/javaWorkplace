package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
//			int a = -123;
//			int b = Math.abs(a);
//			char[] ch = String.valueOf(b).toCharArray();
//			for(int i = 0; i < ch.length / 2; i++) {
//				char t = ch[i];
//				ch[i] = ch[ch.length - 1 - i];
//				ch[ch.length - 1 - i] = t;
//			}
//			if(a < 0) {
//				String str = "-" + String.valueOf(ch);
//				b = Integer.parseInt(str);
//				System.out.println(b);
//			}
//			else {
//				String str =String.valueOf(ch);
//				b = Integer.parseInt(str);
//				System.out.println(b);
//			}
//		String str = "1 2 3";
//		String s = null;
//		char black = ' ';
//		char[] chs = str.toCharArray();
//		for(int i = 0; i < chs.length; i ++) {
//			if(black == chs[i]) {
//				continue;
//			}
//			else {
//				if(i == 0)
//					s = String.valueOf(chs[i]);
//				else s = s + chs[i];
//			}
//		}
//		int a = Integer.parseInt(s);
//		System.out.println(a);
		
//		int tru = 1;
//		int[] num = {-1, -2, 1, -1, 3, 2 , 3 , 4};
//		List<Integer> nums = new ArrayList<Integer>();
//		for(int i  = 0; i < num.length - 1; i++) {
//			for(int j = i + 1; j < num.length; j ++) {
//				if(i == num.length - 2) {
//					nums.add(num[num.length - 1]);
//					break;
//				}
//				if(j == num.length -1 && num[i] != num[num.length - 1]) tru = 1;
//				if(num[i] == num[j]) {
//					tru = 0;
//					break;
//				}
//			}
//			if(tru == 1) nums.add(num[i]);
//		}
//		List<List<Integer>> ans = new ArrayList<List<Integer>>();
//		for(int i = 0; i < nums.size(); i ++) {
//			for(int j = i + 1; j < nums.size(); j ++) {
//				for(int k = j + 1; k < nums.size(); k ++) {
//					if(nums.get(i) + nums.get(j) + nums.get(k) == 0) {
//						List<Integer> l1 = new ArrayList<Integer>();
//						l1.add(nums.get(i));l1.add(nums.get(j));l1.add(nums.get(k));
//						ans.add(l1);
//					}
//				}
//			}
//		}
//		System.out.println(ans);
		
//		int[] num1 = {1, 2};
//		int[] num2 = {2, 4, 5};
//		int[] num = new int[num1.length + num2.length];
//		for(int i = 0; i < num1.length; i ++) {
//			num[i] = num1[i];
//		}
//		for(int i = num1.length; i < num1.length + num2.length; i ++) {
//			num[i] = num2[i - num1.length];
//		}
//		System.out.printf("%f", num.length, (num[num.length / 2] + num[(num.length - 1) / 2]) / 2.0);
////		return (num[num.length / 2] + num[(num.length - 1) / 2]) / 2.0;
//		int x = 123;
//		char[] y = String.valueOf(x).toCharArray();
//		for(int i = 0; i < y.length / 2; i ++) {
//			if(y[i] != y[y.length - 1 - i]) {
//				System.out.println("not");
//				break;
//			}
//		}
//		String str = "abcabcabc";
//		String s1 = null;
//		String s2 = null;
//		for(int i = 1; i < str.length(); i ++) {
//			s1 = str.substring(0, i);
//			System.out.println(s1);
//			while(s1.length() <= str.length()) {
//				s2 = s2 + s1;
//			}
//			if(s2 == str) {
//				System.out.println("true");
//			}
//			else {
//				System.out.println("false");
//			}
//		}
//		
//		String haystack = "abcde";
//		String needle = "cd";
//		for(int i = 0; i < haystack.length(); i++) {
//			for(int j = 0; j < needle.length(); j ++) {
//				if(haystack.charAt(i + j) != needle.charAt(j)) {
//					break;
//				}
//				if(j == needle.length() - 1) {
//					System.out.println(i);
//				}
//			}
//			if(i > haystack.length() - needle.length()) {
//				System.out.println("-1");
//			}
//		}
		
//		int value = 0;
//		(value) ->{
//			System.out.println(value);
//		}
		
//		String s = "sfse afe  fefafe";
//		String[] sp = s.split("\\s+");
//		int min = Stream.of(sp).mapToInt(String::length).min().getAsInt();
//		System.out.println(min);
//		
//		Random seed = new Random();
//		System.out.println(seed);
		
//		String[] s1 = {"sfefefa", "sfe"};
//		String[] s2 = {"fe", "fefefaa"};
//		int max = Stream.of(s1).mapToInt(String::length).max().getAsInt();
//		int min = Stream.of(s2).mapToInt(String::length).min().getAsInt();
//		System.out.println(max - min);
		
		
	}
}