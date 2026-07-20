class Human{
    // int age;
    // String name;
    private int age;
    private String name;

    public Human(){ //deafult constructor
        age=20;
        name="Yaswanth";
    }

    public Human(int age,String name){ // parameterized constructor
        this.age=age;
        this.name=name;
    }


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

public class Constructors{
    public static void main(String[] args){
        Human obj=new Human();
        Human obj1=new Human(22,"Pavan");
        System.out.println(obj.getAge() +" "+ obj.getName());
        System.out.println(obj1.getAge() +" "+ obj1.getName());


        // obj.age=21;
        // obj.name="Yaswanth";
        // System.out.println(obj.age);
        //obj.setAge(25);
        //obj.setName("Virat Kohli");
        // System.out.println(obj.getAge() +" "+ obj.getName());
    }
}