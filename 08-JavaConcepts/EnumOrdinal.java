enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class EnumOrdinal {
    public static void main(String[] args) {

        System.out.println(Level.LOW.ordinal());
        System.out.println(Level.MEDIUM.ordinal());
        System.out.println(Level.HIGH.ordinal());

        //ordinal() enum constant ki position/index return karta hai. Index 0 se start hota hai.
    }
}