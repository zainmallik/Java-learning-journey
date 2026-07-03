public class operations {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));        // 10 + 5
        System.out.println("Subtraction: " + (a - b));     // 10 - 5
        System.out.println("Multiplication: " + (a * b));   // 10 * 5 
        System.out.println("Division: " + (a / b));         // 10 / 5
        System.out.println("Modulus: " + (a % b));         // 10 % 5

        // Relational Operators
        System.out.println("a > b: " + (a > b));           // true
        System.out.println("a < b: " + (a < b));           // false
        System.out.println("a == b: " + (a == b));         // false
        System.out.println("a != b: " + (a != b));         // true

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("AND: " + (x && y));            // false
        System.out.println("OR: " + (x || y));             // true
        System.out.println("NOT: " + (!x));                // false

        // Assignment Operators
        int c = 10;
        c += 5;   // means c = c + 5
        System.out.println("c += 5: " + c);

        c -= 3;   // means c = c - 3
        System.out.println("c -= 3: " + c);

        c *= 2;   // means c = c * 2
        System.out.println("c *= 2: " + c);

        c /= 2;   // means c = c / 2
        System.out.println("c /= 2: " + c);
    }
}