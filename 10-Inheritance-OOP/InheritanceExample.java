class Animal{
    void sound(){
        System.out.println("Animals makes sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
public class InheritanceExample{ 
    public static void main(String[] args) {
        Dog obj=new Dog();
obj.sound();
obj.bark();
    }
}