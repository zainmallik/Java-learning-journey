import java.util.Set;
import java.util.TreeSet;

public class TreeSetExp {
    public static void main(String[] args) {

        Set<Integer> nums = new TreeSet<>();

        nums.add(61);
        nums.add(72);
        nums.add(92);
        nums.add(82);
        nums.add(102);
        nums.add(102);

        System.out.println("TreeSet: " + nums);
        System.out.println("Duplicates are removed and values are sorted.");
    }
}
