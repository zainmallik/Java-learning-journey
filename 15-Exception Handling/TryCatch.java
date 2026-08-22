public class TryCatch {
    public static void main(String[] args) {

        int i = 10;
        int j = 0;

        try {
            j = 18 / j;
            System.out.println(j);
        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }

        System.out.println("Program is still running");
    }
}