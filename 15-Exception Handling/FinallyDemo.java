public class FinallyDemo {
    public static void main(String[] args) {

        int i = 2;
        int j = 0;

        try {
            j = 18 / i; // Not Exception
            System.out.println("BYE!.....");
        }
        catch (Exception e) {
            System.out.println("An error occurred!");
        }
        finally {
            System.out.println("BYE!.....");// It will execute whether exception occurs or not (Final Boss of Exception Handling lol)
        }
    }
}