// Encapsulation means wrapping data (variables) and methods together inside a class and controlling access to the data.
// We mainly achieve encapsulation by:
// Declaring variables as private
// Providing public getter and setter methods to access/update them.
// Adding validation inside methods when necessary.
// Keeping the internal implementation hidden from code outside the class.


class A{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}

public class Encapsulation1 {
    public static void main(String []args){
        A obj=new A();
        obj.setAge(22);
        obj.setName("Yaswanth");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
