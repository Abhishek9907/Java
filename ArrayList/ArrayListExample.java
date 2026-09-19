import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args){
        // ArrayList<String> list = new ArrayList<>();
        // list.add("Hello");
        // list.add("World");
        // System.out.println(list);
        // ArrayList<Double> list2 = new ArrayList<>();
        // list2.add(3.14);
        // list2.add(2.71);
        // System.out.println(list2.get(0));

        /*Example of an empty ArrayList */
        // ArrayList<String> emptyList = new ArrayList<>();
        // System.out.println(emptyList.get(0)); // This will throw an IndexOutOfBoundsException

        // ArrayList<String> list = new ArrayList<>();
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter strings to add to the list (type 'exit' to finish):");
        // while (true) {
        //     String input = scanner.nextLine();
        //     if(input.equalsIgnoreCase("exit")){
        //         break;
        //     }
        //     list.add(input);
        // }
        // System.out.println("Final list: " + list);

        ArrayList <String> teacherName= new ArrayList<>();
        teacherName.add("Manisha");
        teacherName.add("Abhishek");
        teacherName.add("Aayansh");

        System.out.println("Number of items in the list " +teacherName.size());

        for (int index=0;index<teacherName.size();index++){
            System.out.println(index);
            System.out.println(teacherName.get(index));
            
        }


        ArrayList <Integer> countNmbers = new ArrayList<>();
        countNmbers.add(1);
        countNmbers.add(2);
        countNmbers.add(3);
        countNmbers.add(4);
        countNmbers.add(5);

        int index = countNmbers.size()-1;

        while(index>=0){
            int number = countNmbers.get(index);
            System.out.println(number);
            index = index-1;
        }
        Collections.reverse(countNmbers);
        System.out.println(countNmbers);

       ArrayList <Integer> totalNumbers = new ArrayList<>();
       System.out.println("Enter number to add in the list and -1 to exit");
       while (true) {
        
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        if(numbers ==-1) {
            break;
        }
        totalNumbers.add(numbers);
    }

    System.out.println(totalNumbers);

       }

    }

