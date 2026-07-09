class Student {
    int roll;
    int marks;
    String name;
}

public class arrayofobjects {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Ali";
        s1.marks = 92;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Zain";
        s2.marks = 44;

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Ahmed";
        s3.marks = 12;

        Student[] students = {s1, s2, s3};

        for (Student s : students) {
            System.out.println(s.name + " : " + s.marks);
        }
    }
}