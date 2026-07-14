class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class ConcreteClass {

    public static void main(String[] args) {

        Student s1 = new Student("Zain", 19);

        s1.displayInfo();
    }
}