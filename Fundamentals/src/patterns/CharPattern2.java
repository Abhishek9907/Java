package patterns;

import java.util.Scanner;

public class CharPattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			char startingCharacer=(char)('A'+i-1);
			int j=1;
			while(j<=n) {
				System.out.print(startingCharacer);
				startingCharacer++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
