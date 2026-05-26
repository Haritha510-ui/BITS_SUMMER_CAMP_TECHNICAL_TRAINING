package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();

        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.println("Enter student name:");
            String name = sc.nextLine();
            students.add(name);
        }

        System.out.println("Enter student name to search:");
        String search = sc.nextLine();

        if(students.contains(search)) {
            System.out.println("Student exists");
        } else {
            System.out.println("Student does not exist");
        }
        sc.close();
    }
}
