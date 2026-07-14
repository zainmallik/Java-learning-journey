abstract class Animal {

    Animal() {
        System.out.println("Animal Constructor Called");
    }

    abstract void sound();

    void eat() {
        System.out.println("Animal is Eating");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
        dog.eat();
    }
}