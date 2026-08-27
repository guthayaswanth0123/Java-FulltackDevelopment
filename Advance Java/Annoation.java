// Annotations provide extra information (metadata) to Java/compiler/tools. They can make development easier, help detect errors, and reduce boilerplate code in some cases.
public class A{
    public void show(){
        System.out.println("In A Show");
    }
}
public class B extends A{
    public void shows(){
        System.out.println("In B show");
    }
}

public class Annoation{
    public static void main(String[] args){
        B obj=new B();
        obj.show();
    }
}