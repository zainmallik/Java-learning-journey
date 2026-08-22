public class MultiCatch {
    public static void main(String[] args) {

        int i = 10;
        int j = 0;
        String str = "Zain";
        int nums[] = new int[10];

        try {

            j = 18 / i;
            System.out.println(str.length()); //Zain has 4 characters
            System.out.println(nums[9]); //Every Index is zero by default

        }
        catch (ArithmeticException e) {
            System.out.println("Can't divide by 0");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in limit");
        }
        catch (Exception e)// Exception is the parent class of all exceptions, so it will catch any exception that is not caught by the previous catch blocks.
     {
            System.out.println("Something went wrong " + e);
        }

        System.out.println(j);
        System.out.println("But running...");
    }
}