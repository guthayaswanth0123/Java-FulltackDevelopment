//we ahve 2 or more methods both are throwing same exceptions and wwe ahve anotehr methods tahat meethod is claling tahat two methods in this
//method only we can handle thsoe exceptions in ataht above methids we jsuts throws exceptions 

class A{
    public void show() throws ClassNotFoundException {
        Class.forName("ThowsDemo"); //Class.forName() is used to load a class into the JVM at runtime.
    }
}
public class ThowsDemo {
    static{
        System.out.println("Calss Loaded");
    }
    public static void main(String[] args) {
        A obj=new A();
        try{
            obj.show();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
