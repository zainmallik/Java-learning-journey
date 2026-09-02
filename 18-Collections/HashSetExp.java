import java.util.HashSet;
import java.util.Set;

public class HashSetExp {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>();

        nums.add(61);
        nums.add(72);
        nums.add(92);
        nums.add(82);
        nums.add(102);
        nums.add(102);

        System.out.println("HashSet: " + nums);
        System.out.println("Duplicate 102 is stored only once.");
    }
}
