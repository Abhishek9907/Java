import java.util.ArrayList;
import java.util.Scanner;

public class LastInList{
    public static void main(String args[]){
        System.out.println("ArraryList Last in list example ");

        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter the names ");
        
        while (true) {
           Scanner sc = new Scanner(System.in);
           String name=sc.nextLine().trim();
           if (name.isEmpty()) {
            break;
           }
           names.add(name); 
        }
        System.out.println(names);
    
    }
}