public class arraydimensions {
    public static void main(String[] args) {

        // 1D Array
        int[] nums1 = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }

        System.out.println("\n");

        // 2D Array
        int[][] nums2 = new int[3][4];

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                nums2[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] row : nums2) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Jagged 2D Array
        int[][] nums = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int[] row : nums) {
            for (int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}