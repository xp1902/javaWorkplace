package booksalepro;

import java.util.Random;

public class Booksalepro {
	private static int saleNum = 0;
	public Booksalepro(String title){
		System.out.printf("这本书的名字是：%s%n", title);
		saleNum++;
	}
	public int getSaleNum() {
		return saleNum;
	}
	public static void main(String[] args) {
		String[] titles = {"疯狂java讲义", "c++程序设计", "c语言陷阱与缺陷"};
		for(int i = 0; i < 5; i++) {
			new Booksalepro(titles[new Random().nextInt(3)]);
		}
	}
}
