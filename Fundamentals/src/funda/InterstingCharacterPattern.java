package funda;

import java.util.Scanner;

public class InterstingCharacterPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		
		while(i<=n) {
			int j=1;
			char startingCharacer=(char)('A'+n-i);
			while(j<=i) {
				System.out.print(startingCharacer);
				startingCharacer++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
