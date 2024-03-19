package funda;

import java.util.Scanner;

public class RightSidePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(' ');
				spaces++;
			}
			int start=1;
			while(start<=i) {
				System.out.print("*");
				start++;
			}
			System.out.println();
			i++;
			
		}

	}

}
