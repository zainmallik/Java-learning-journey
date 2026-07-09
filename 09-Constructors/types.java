class Student {

    String name;
    int age;

    // 1. Default Constructor
    Student() {
        System.out.println("Default Constructor Called");
    }

    // 2. Parameterized Constructor
    Student(String name) {
        this.name = name;
        System.out.println("Parameterized Constructor");
        System.out.println("Name: " + name);
    }

    // 3. Constructor Overloading
    Student(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Constructor Overloading");
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

public class types {

    public static void main(String[] args) {

        System.out.println("-----Default Constructor-----");
        Student s1 = new Student();

        System.out.println();

        System.out.println("-----Parameterized Constructor-----");
        Student s2 = new Student("Zain");

        System.out.println();

        System.out.println("-----Constructor Overloading-----");
        Student s3 = new Student("Ali", 21);

        System.out.println();

        System.out.println("-----Display Method-----");
        s3.display();
    }
}