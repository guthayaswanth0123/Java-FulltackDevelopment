
class A{
    public void show(){
        System.out.println("Hi");
    }
}

class B{
    public void show(){
        System.out.println("Hello");
    }
}

        
public class Demo {
    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();
        obj.show();
        obj1.show();
    }
}
