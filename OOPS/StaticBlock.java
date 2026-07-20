class Mobile{
    String brand;
    int price;
    static String name; // static variable is shared by all objects 


    static{//only once it executes because the class loader in jvm loads onnly one time evry class tha's why wet one time printed
        name="Phone";
        System.out.println("static Block");
    }


    Mobile(){
        brand="";
        price=200;
        System.out.println("COnstructor");
    }

    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }



}
public class StaticBlock{
    public static void main(String[] args)throws ClassNotFoundException{ 
        // Mobile obj1=new Mobile();
        // obj1.brand="Samsung";
        // obj1.price=8800;
        // Mobile.name="mobile";

        // Mobile obj2=new Mobile();

        // we do not create objects then we try to run the code no output  no class load if you wnat to laod
        Class.forName("Mobile");//it will load our class into class laoder without obect
        


    }
}