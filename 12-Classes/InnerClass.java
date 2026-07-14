class University {

    String universityName = "Virtual University";

    class Department {

        String departmentName = "Computer Science";

        void display() {
            System.out.println("University : " + universityName);
            System.out.println("Department : " + departmentName);
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {

        University university = new University();

        University.Department department = university.new Department();

        department.display();
    }
}