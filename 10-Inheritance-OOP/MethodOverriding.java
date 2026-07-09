class A {

    public void show() {
        System.out.println("Inside A");
    }
}

class B extends A {

    @Override
    public void show() {
        System.out.println("Inside B");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        B obj = new B();

        obj.show();
    }
}