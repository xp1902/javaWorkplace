package booksalepro;

import java.util.Random;

public class Booksalepro {
	private static int saleNum = 0;
	public Booksalepro(String title){
		System.out.printf("�Ȿ��������ǣ�%s%n", title);
		saleNum++;
	}
	public int getSaleNum() {
		return saleNum;
	}
	public static void main(String[] args) {
		String[] titles = {"���java����", "c++�������", "c����������ȱ��"};
		for(int i = 0; i < 5; i++) {
			new Booksalepro(titles[new Random().nextInt(3)]);
		}
	}
}
