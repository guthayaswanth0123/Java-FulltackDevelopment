class Mobile{
    String brand;
    int price;
    static String name; // static variable is shared by all objects 

    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
}
public class StaticDemo{
    public static void main(String[] args){
        Mobile obj=new Mobile();
        obj.brand="Apple";
        obj.price=66000;
        //obj.name="SmaprtPhone";
        Mobile.name="mobile";


        //obj.name="Phone"; // we can call using objects also 

        Mobile.name="mobile"; // this is the standarrd way to access static varibles

        Mobile obj1=new Mobile();
        obj1.brand="Samsung";
        obj1.price=8800;
        //obj1.name="SmartPhone";
        Mobile.name="mobile";

        obj.show();
        obj1.show();

    }
}