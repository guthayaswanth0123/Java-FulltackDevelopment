class Human{
    // int age;
    // String name;
    private int age;
    private String name;

    public void setAge(int age){
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation{
    public static void main(String[] args){
        Human obj=new Human();
        System.out.println(obj.getAge() +" "+ obj.getName());

        // obj.age=21;
        // obj.name="Yaswanth";
        // System.out.println(obj.age);
        obj.setAge(25);
        obj.setName("Virat Kohli");
        // System.out.println(obj.getAge() +" "+ obj.getName());
    }
}