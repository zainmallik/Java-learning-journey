public class logicaloperators {
    public static void main(String[] args) {

        int age = 22;
        boolean hasCNIC = true;
        boolean hasTicket = false;

        // AND Operator
        if (age >= 18 && hasCNIC) {
            System.out.println("You are eligible for verification.");
        }

        // OR Operator
        if (hasCNIC || hasTicket) {
            System.out.println("You have at least one valid document.");
        }

        // NOT Operator
        if (!hasTicket) {
            System.out.println("You need to buy a ticket.");
        }
    }
}