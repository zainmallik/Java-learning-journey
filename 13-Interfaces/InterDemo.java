
interface Animal {
    void sound();

    void eat();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {

        System.out.println("Dog eats");
    }
}

public class InterDemo {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.eat();
        obj.sound();

    }
}
