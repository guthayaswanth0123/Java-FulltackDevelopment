// abstract class = incomplete class
// abstract method = incomplete method
// abstarction class or method it will just dcelare the things child class implement thsoe methods or classes




abstract class Car{ 

    public abstract void sound(); // class muste be abtsrcat
    public void drive(){
        System.out.println("Can Drive");
    }
    public void playMusic(){
        System.out.println("Can can Play Music");
    }
}

class BMW extends Car{
    public void sound() {
        System.out.println("BMW Sound");
    }
    public void playMusic(){
        System.out.println("BMW can play Music");
    }
}

class Telsa extends Car{
    public void drive(){
        System.out.println("Auomate Driving");
    }
    public void sound(){
        System.out.println("Sounds");
    }
}

public class Abstract{
    public static void main(String[] args){
        // Car obj=new Car();
        // obj.drive();
        // obj.playMusic();
        Car obj1=new Telsa();
        obj1.drive();
        obj1.sound();
    }
}