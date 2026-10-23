import java.util.ArrayList;

public class TeachersArray {
    public static void main(String[] args) {
        System.out.println("this is regarding sum");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(72);
        numbers.add(2);
        numbers.add(8);
        numbers.add(11);
        numbers.add(-1);

        int totalSumValue=0;

        for (Integer number : numbers) {
            totalSumValue=number+totalSumValue;
        }

        System.err.println("total value is "+totalSumValue);

    }
}
