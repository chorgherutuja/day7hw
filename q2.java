package day7;
import java.util.Scanner;
public class q2 {

	public static void areaoftraingle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the base value:");
		int base = sc.nextInt();
		
		System.out.println("enter the height value:");
		int height = sc.nextInt();
		
		System.out.println("Area Of Traingle:" +(base*height/2));	
	}
	
	public static void main(String[] args) {
		areaoftraingle();
		}
}
