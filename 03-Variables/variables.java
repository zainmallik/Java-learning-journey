public class variables {
    public static void main(String[] args) {

        // Local Variable: declared inside method
        int age = 20;      

        // Variable can be changed (mutable)
        age = 21;

        // Different data types variables
        byte b = 10;                  // -128 to 127
        short s = 1000;               // -32,768 to 32,767
        int i = 50000;                // -2 billion to +2 billion
        long l = 15000000000L;        // very large numbers

        float f = 5.5f;              // decimal (less precision)
        double d = 55.55;            // decimal (more precision)

        char c = 'A';               // single character
        boolean isActive = true;    // true or false

        System.out.println("Age: " + age);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + isActive);
    }
}