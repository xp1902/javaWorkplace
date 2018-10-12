package test;

import powerAdapter.Adapter;
import twoH.TwoH;

public class Test {
	public static void main(String[] args) {
		TwoH twoh = new TwoH();
		Adapter xthree = new Adapter(twoh);
		xthree.request();
	}
}
