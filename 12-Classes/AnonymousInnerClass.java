class Animal {

    void sound() {
        System.out.println("Animal Makes Sound");
    }
}

public class AnonymousInnerClass {

    public static void main(String[] args) {

        Animal dog = new Animal() {

            @Override
            void sound() {
                System.out.println("Dog Barks");
            }
        };

        Animal cat = new Animal() {

            @Override
            void sound() {
                System.out.println("Cat Meows");
            }
        };

        dog.sound();
        cat.sound();
    }
}