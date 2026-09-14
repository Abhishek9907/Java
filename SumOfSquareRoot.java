import java.util.Scanner;
public class SumOfSquareRoot{
    public static void main(String args[]){
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int firstValue =sc.nextInt();
        int secondValue=sc.nextInt();
        int totalValue=firstValue+secondValue;
        double squareRoot=Math.sqrt(totalValue);
        System.out.println(totalValue);
        System.out.println(squareRoot);
    }
}