package patterns;

import java.util.Scanner;

public class SquarePatterns {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				if(i==1 || i==n ||j==1 ||j==n) {
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}

	}

}
