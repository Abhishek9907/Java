package patterns;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			System.out.print("*");
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j=j+1;
			}
		j=j-2;
			while(j>=1) {
				System.out.print(j);
				j=j-1;
		}
			

			System.out.println("*");
			i=i+1;
		}
		
		int i2=n-1;
		while(i2>=1) {
		int j2=1;
		while(j2<=i2) {
			System.out.print("*");
			j2=j2+1;
		}
           System.out.println();
           i2=i2-1;
		}
	}

}
