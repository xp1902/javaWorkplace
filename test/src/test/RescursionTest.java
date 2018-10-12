package test;

public class RescursionTest {
	
	public static long factorial(long number) {
		return number <= 1? 1:factorial(number - 1)* number;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i <= 4; i++) {
			System.out.printf("%d! = %d%n", i,factorial(i));
		}
		for(int i = 0; i <= 4; i++) {
			System.out.printf("Fibonacci of %d is %d%n", i, fibonacci(i));
		}
		
		
	}

	private static int fibonacci(int i) {
		// TODO Auto-generated method stub
		return (i == 1|| i ==2)? 1:(i == 0? 0:fibonacci(i - 1) + fibonacci(i - 2));
	}
}
