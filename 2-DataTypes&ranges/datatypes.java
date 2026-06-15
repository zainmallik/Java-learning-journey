public class datatypes {

    public static void main(String[] args){
        
        // byte range: -128 to 127
        byte b = 127;

        // short range: -32,768 to 32,767
        short s = 32767;

        // int range: -2,147,483,648 to 2,147,483,647
        int i = 2147483647;

        // long range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        // float range: approximately ±3.4E38 (6-7 decimal digits precision)
        float f = 3.4e38f;

        // double range: ±1.7E308 (15-16 decimal digits precision)
        double d = 1.7e308;

        // char range: 0 to 65,535 (Unicode characters)
        char c = 'A';

        // boolean: true or false
        boolean flag = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);
    }
}