import java.util.ArrayList;
import java.util.List;

public class ListArrayExp {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(61);
        nums.add(72);
        nums.add(92);
        nums.add(82);
        nums.add(102);
        nums.add(102);

        System.out.println("List: " + nums);
        System.out.println("Element at index 3: " + nums.get(3));
        System.out.println("Index of 102: " + nums.indexOf(102));

        for (int n : nums) {
            System.out.println(n);
        }
    }
}
