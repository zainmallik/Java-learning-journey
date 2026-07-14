final class A {

}

// class B extends A { } // Error

public class FinalKeywordDemo {

    public static void main(String[] args) {

        final int x = 10;

        // x = 20; // Error

        System.out.println(x);
    }
}