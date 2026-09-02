import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExp {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(61);
        nums.add(72);
        nums.add(92);
        nums.add(82);
        nums.add(102);
        nums.add(102);

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}
