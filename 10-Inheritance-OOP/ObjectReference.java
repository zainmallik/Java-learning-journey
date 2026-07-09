class Student {
    String name = "Zain";
}

public class ObjectReference {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = s1;   // reference to same object
        System.out.println(s1.name);
        System.out.println(s2.name);
        s2.name = "Malik";
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
