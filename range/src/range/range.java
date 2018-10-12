/**
 * 
 */
/**
 * @author xp1902
 *
 */
package range;

public class range{
	private static int max;
	private static int min;
	private static float ave;
	public static void main(String[] args) {
		int[] score = {100, 97, 87, 88, 94, 92, 91, 67, 74, 89};
		max = score[0];
		min = score[0];
		for(int i = 0; i < 10; i++) {
			if(score[i] > max) max = score[i];
			if(score[i] < min) min = score[i];
			ave += score[i];
		}
		ave = (ave - max - min) / 8;
		System.out.printf("平均得分为：%+3.1f", ave);
		
	}
}