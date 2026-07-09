public class Allloops {
    public static void main(String[] args) {

        // 1. for loop
        /*
         * Syntax of for loop
         * for (initialization; condition; increment/decrement) {
         * }
         */
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2. while loop
        /*
         * Syntax of while loop
         * initialization;
         * while (condition) {
         * increment/decrement;
         * }
         */

        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // 3. do-while loop
        /*
         * Syntax of do-while loop
         * initialization;
         * 
         * do {
         * increment/decrement;
         * } while (condition);
         */
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        // 4. Enhanced for loop (for-each)
        /*
         * Syntax of enhanced for loop (for-each)
         * for (dataType variable : arrayOrCollection) {
         * 
         * }
         */
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int num : numbers) {
            System.out.println(num);
        }

        // Nested loops
        /*
         * Syntax of nested loop
         * for (initialization; condition; increment/decrement) {
         * 
         * for (initialization; condition; increment/decrement) {
         * 
         * }
         * }
         */
        System.out.println("\nNested Loop:");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Infinite loop (commented)
        /*
         * for (;;) {
         * System.out.println("Infinite Loop");
         * }
         */
    }
}