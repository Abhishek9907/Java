package funda;

import java.util.Scanner;

public class NumberTringle {

		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n= sc.nextInt();
			int i=1;
			while(i<=n) {
				int spaces=1;
				while(spaces<=n-i) {
					System.out.print(' ');
					spaces=spaces+1;
				}
				int start=1;
				while(start<=i) {
					System.out.print(start);
					start=start+1;
				}
				int descr= i-1; 
				//System.out.println(descr);
				while(descr>=1){
				System.out.print(descr);
					descr=descr-1;
					
}
				System.out.println();
				i++;
}
				
				
			}

		}


