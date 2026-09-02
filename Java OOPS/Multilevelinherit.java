// Reference type decides what methods you can access; actual object decides which overridden method executes.
class Animal{
    public String name="Horse";
    public void eat(){
        System.out.println("Animal Can eat");
    }
    public void bark(){
        System.out.println("Animal Can barks");
    }
    public void sleep(){
        System.out.println("Animal Can sleep");
    }
}

class Dog extends Animal{
    public String name="Chintu";
    public void eat(){
        System.out.println("Dog Can eat");
    }
    public void bark(){
        //super.bark();
        System.out.println("Dog Can barks");
    }

    public void run(){
        System.out.println("Dog can run");
    }
}

class cat extends Dog{
    public String name="Black Cat";
    public void bark(){
        super.bark();
        System.out.println("cat Can barks");
    }

    public void run(){
        System.out.println("cat can run");
    }

    public void sound(){
        System.out.println("cat can meowww..");
    }
}

public class Multilevelinherit {
    public static void main(String[] args){
        // cat obj=new cat();
        // obj.bark();

        // cat obj1=new cat();
        // obj1.run();
        Animal obj=new cat();
        System.out.println(obj.name);
    }
}
