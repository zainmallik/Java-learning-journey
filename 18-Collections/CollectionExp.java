import java.util.ArrayList;
import java.util.Collection;

public class CollectionExp {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>();

        nums.add(61);
        nums.add(72);
        nums.add(92);
        nums.add(82);
        nums.add(102);

        System.out.println(nums);
        System.out.println("Size: " + nums.size());
    }
}
