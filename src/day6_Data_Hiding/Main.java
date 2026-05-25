package day6_Data_Hiding;

 class Student {
    // private data
    private int marks = 90; // marks is private,it cannot be accessed directly

    // public method to access data
    public int getMarks() {    // getMarks() it is used to access the value this process is called data hiding
        return marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        // accessing data using method
        System.out.println("Marks = " + s.getMarks());
    }
}

