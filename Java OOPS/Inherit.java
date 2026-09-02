// Reference type decides what methods you can access; actual object decides which overridden method executes.
class Animal{
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
    public void eat(){
        System.out.println("Dog Can eat");
    }
    public void bark(){
        super.bark();
        System.out.println("Dog Can barks");
    }

    public void run(){
        System.out.println("Dog can run");
    }
}


public class Inherit {
    public static void main(String[] args){
        // Animal obj=new Animal();
        // obj.eat();

        // Dog obj1=new Dog();
        // obj1.eat();

        Dog obj=new Dog();
        obj.run();
    }
}
