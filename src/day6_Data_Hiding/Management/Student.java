package day6_Data_Hiding.Management;

public class Student {
   public String name = "Student1";
   private String subject = "java";
   protected double amount = 500000;
    String department = "CSE";

    public void displayDetails() {
        String name = "Haritha";
        System.out.println("Name : " + name);
        System.out.println("Subject : " + subject);
        System.out.println("Amount : " + amount);
        System.out.println("Department : " + department);
    }
}
