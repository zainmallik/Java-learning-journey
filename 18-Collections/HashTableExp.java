import java.util.Hashtable;
import java.util.Map;

public class HashTableExp {
    public static void main(String[] args) {

        Map<String, Integer> students = new Hashtable<>();

        students.put("Zain", 99);
        students.put("Ahmed", 80);
        students.put("Sidra", 100);
        students.put("Family", 90);

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
