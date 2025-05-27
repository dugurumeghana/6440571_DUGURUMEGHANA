import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // Adding entries
        System.out.println("Enter student ID and name (type ID -1 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            if (id == -1) break;

            System.out.print("Name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }

        // Retrieve name by ID
        System.out.print("Enter an ID to retrieve the student name: ");
        int searchId = sc.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("No student found with ID " + searchId);
        }
    }
}
