package funda;

import java.util.Scanner;
public class AverageOfThree {

	public static void main(String[] args) {
	   String str=new String();
	   int m1,m2,m3;
	   int result;
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter Your Name and Number Below ");
	   str=sc.next();
	   char ch=str.charAt(0);
	   m1=sc.nextInt();
	   m2=sc.nextInt();
	   m3=sc.nextInt();
	   result=(m1+m2+m3)/3;
	   System.out.println("Name is "+ch);
	   System.out.println("Average is :"+result);

	}

}
