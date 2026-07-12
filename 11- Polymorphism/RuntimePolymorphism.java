class A {
    void show() {
        System.out.println("A ka show");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("B ka show");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {

        A obj = new B();
        obj.show();
    }
}