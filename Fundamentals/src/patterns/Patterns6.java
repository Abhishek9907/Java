package patterns;

import java.util.Scanner;

public class Patterns6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n) {
			int counter=i;
			int j=1;
			while(j<=i) {
			System.out.print(counter);
			counter--;
			j=j+1;
			}
			System.out.println();
			i=i+1;
		}

	}

}
