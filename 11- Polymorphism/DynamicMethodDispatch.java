class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("B");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        A obj = new B();
        obj.show();
    }
}