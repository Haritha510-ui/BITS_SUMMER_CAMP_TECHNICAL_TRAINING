package Day9;

public class Cube {
    int num;
    Cube(int num) {
        this.num = num;
    }
    void cubeOfNum() {
        System.out.println("Cube of " + num + " is: " + (num * num * num));
    }
    public static void main(String[] args) {
        Cube obj = new Cube(5);
        obj.cubeOfNum();
    }
}
