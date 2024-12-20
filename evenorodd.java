package day7;
import java.util.Scanner;
public class evenorodd {

	public static void evenodd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int a =sc.nextInt();
		
		if(a%2==0) {
			System.out.println("number is even "+a);
		}else {
			System.out.println("number is odd "+a);
		}
	}
	
	public static void main(String[] args) {
		evenodd();
	}
}
