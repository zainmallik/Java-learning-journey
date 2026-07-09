class A {

    public void show() {
        System.out.println("Anonymous Object Example");
    }
}

public class AnonymousObject {

    public static void main(String[] args) {

        new A().show();   // Object without reference
    }
}