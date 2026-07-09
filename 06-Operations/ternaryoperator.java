public class ternaryoperator {
    public static void main(String[] args) {

        int age = 17;

        String status = (age >= 18) ? "Eligible to Vote" : "Not Eligible to Vote";

        System.out.println(status);

        int number = 25;

        String result = (number % 2 == 0) ? "Even Number" : "Odd Number";

        System.out.println(result);
    }
}