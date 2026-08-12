interface Greetings {
    void greet(String name);
}

interface Square {
    int square(int i);
}

public class LambdaExp {

    public static void main(String[] args) {
        Greetings obj = name -> System.out.println("Assalamuellakum" + " " + name);
        obj.greet("Zain");

        Square squ = i -> {
            int result = i * i;
            System.out.println(result);
            return result;
        };
        squ.square(5);
    }
}