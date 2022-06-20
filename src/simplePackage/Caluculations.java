package simplePackage;

import java.util.Scanner;

public class Caluculations {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int a, b;
		
		System.out.println("Enter First Name : ");
		a = sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		b = sc.nextInt();
		sum(a, b);

	}
	
	static public void sum(int x,int y)
	{
		int c = x+y;
		System.out.println("Sum of two numbers is : " + c);
	}

}
