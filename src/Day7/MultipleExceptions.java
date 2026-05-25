package Day7;

public class MultipleExceptions {
    public static void main(String[] args) {

        try {
            // ArrayIndexOutOfBoundsException
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);

            // NullPointerException
            String s = "Ammu";
            System.out.println(s.length());

            // ArithmeticException
            int a = 10 / 0;
            System.out.println(a);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }
}