import java.util.HashMap;
import java.util.Map;

public class HashMapExp {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Zain", 99);
        students.put("Ahmed", 80);
        students.put("Sidra", 100);
        students.put("Family", 90);

        System.out.println("Keys: " + students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
