@FunctionalInterface
interface Calculator {
    public int add(int i, int j);
}

public class LambdaDemo {
    public static void main(String[] args) {
        Calculator calc = (i, j) -> {
            int result = i + j;
            System.out.println(result);
            return result;
        };
        calc.add(5, 7);

    }
}
