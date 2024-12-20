package day7;
import java.util.Scanner;
public class q1 {

	public static void arithmatic() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		int a =sc.nextInt();
		
		System.out.println("Enter the second value");
		int b =sc.nextInt();
		
		System.out.println("Addition of a and b: " +(a+b));
		System.out.println("Substraction of a and b: " +(a-b));
		System.out.println("Division of a and b: " +(a/b));
		System.out.println("Multiplication of a and b: " +(a*b));
	}
	
	public static void main(String[] args) {
		arithmatic();
	}
}
