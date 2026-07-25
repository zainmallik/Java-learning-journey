enum Status {
    BasicVersion,
    Trial,
    MidVersion,
    PremiumVersion
}

public class EnumDemo {

    public static void main(String[] args) {

        // all enum values with their ordinal numbers
        System.out.println("=== Enum Values ===");

        for (Status status : Status.values()) {
            System.out.println(status + " : " + status.ordinal());
        }

        System.out.println();

        // Store an enum value
        Status currentStatus = Status.Trial;

        System.out.println("Current Status: " + currentStatus);
        System.out.println();

        // Using switch is more comfortable
        System.out.println("=== Switch Statement ===");

        switch (currentStatus) {

            case BasicVersion:
                System.out.println("Start your first Premium plan.");
                break;

            case Trial:
                System.out.println("Trial ending in 3 days.");
                break;

            case MidVersion:
                System.out.println("You're using the Mid Version.");
                break;

            case PremiumVersion:
                System.out.println("You're a Premium user.");
                break;

            default:
                System.out.println("Unknown Status.");
        }

        System.out.println();

        // Same logic using if-else
        System.out.println("=== If-Else Statement ===");

        if (currentStatus == Status.BasicVersion) {
            System.out.println("Start your first Premium plan.");
        } else if (currentStatus == Status.Trial) {
            System.out.println("Trial ending in 3 days.");
        } else if (currentStatus == Status.MidVersion) {
            System.out.println("You're using the Mid Version.");
        } else if (currentStatus == Status.PremiumVersion) {
            System.out.println("You're a Premium user.");
        } else {
            System.out.println("Unknown Status.");
        }
    }
}