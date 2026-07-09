class Brand{
    String brand= "Toyota";
     void drive(){ 
        System.out.println("Car is Running");
    }
}
public class OOPExample{
public static void main(String args[]){
    Brand obj=new Brand();
    System.out.println(obj.brand);
    obj.drive();
}
}
