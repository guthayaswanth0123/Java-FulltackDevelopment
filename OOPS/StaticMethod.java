class Mobile{
    String brand;
    int price;
    static String name; // static variable is shared by all objects 

    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }

    //  public static void show(){ // static method can't acces instance variables directly we cann acess throgh class refrence
    //     System.out.println(brand+" "+price+" "+name);
    // }

    public static void show(Mobile obj){
        System.out.println(obj.brand+" "+obj.price+" "+name);

    }


}
public class StaticMethod{
    public static void main(String[] args){ // why static because if we not declare as static we need to create an object to call a method main
    //program exceution starts from main how we can create an object for main method
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

        // obj.show();
        // obj1.show();

        Mobile.show(obj);
    }
}