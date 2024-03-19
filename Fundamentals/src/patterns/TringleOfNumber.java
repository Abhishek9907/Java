package patterns;

import java.util.Scanner;

public class TringleOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int startingValue=i;
			int endingValue=2;
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(' ');
				spaces=spaces+1;
				
			}
			while(j<=i) {
				System.out.print(startingValue);
				startingValue=startingValue+1;
				j=j+1;
			}
			int valueToBePrinted=2*i-2;
			while(endingValue<=i) {
				System.out.print(valueToBePrinted);
				valueToBePrinted=valueToBePrinted-1;
				endingValue=endingValue+1;
			}
			System.out.println();
			i=i+1;
		}

	}

}
