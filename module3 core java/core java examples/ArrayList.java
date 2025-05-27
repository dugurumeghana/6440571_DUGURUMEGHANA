import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("Enter student names (type 'exit' to stop):");
        while (true) {
            name = sc.nextLine();
            if (name.equalsIgnoreCase("exit")) break;
            names.add(name);
        }

        System.out.println("Student Names:");
        for (String n : names) {
            System.out.println(n);
        }
    }
}
