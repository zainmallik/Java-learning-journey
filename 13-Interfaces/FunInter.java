@FunctionalInterface
interface Calculator {
    int add(int i, int j);

}

class Add implements Calculator {
    public int add(int i, int j) {
        return i + j;
    }
}

public class FunInter {
    public static void main(String[] args) {
        Calculator calc = new Add();
        int result = calc.add(5, 7);
        System.out.println(result);
    }

}
