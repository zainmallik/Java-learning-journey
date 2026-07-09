/*
-------------------------
1. Static Variable Syntax
-------------------------
class ClassName {
    static dataType variableName;
}

-------------------------
2. Static Method Syntax
-------------------------=
class ClassName {
    static returnType methodName() {

    }
}

-------------------------
3. Display() or Other Methods Syntax
-------------------------
class ClassName {
    returnType methodName() {

    }
}

-------------------------
4. Calling Methods
-------------------------

// Non-static method
objectName.methodName();

// Static method
ClassName.methodName();

-------------------------
5. Creating Objects
-------------------------
ClassName objectName = new ClassName();

-------------------------
*/

class Mobile {
    int price;
    String name;
    static String category = "Smartphone";

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Category : " + category);
    }

    static void showCategory() {
        System.out.println("Category is : " + category);
    }
}

public class javaconcepts {
    public static void main(String[] args) {

        Mobile mob1 = new Mobile();
        mob1.name = "Apple";
        mob1.price = 500;

        Mobile mob2 = new Mobile();
        mob2.name = "Samsung";
        mob2.price = 700;

        mob1.display();
        System.out.println();

        mob2.display();
        System.out.println();

        Mobile.showCategory();
    }
}