class Father{
    public void sing(){
        System.out.println("ftaher can sing");
    }
    public void work(){
        System.out.println("Father can do work");
    }
}

class child extends Father{
     public void sing(){
        System.out.println("child can sing");
    }
    public void study(){
        System.out.println("child can do study");
    }
}

class child2 extends Father{
     public void sing(){
        System.out.println("child2 can sing");
    }
    public void study(){
        System.out.println("child2 can do study");
    }

    public void sleep(){
        System.out.println("chld2 can sleep");
    }
}


public class HeriricahlInherit {
    public static void main(String[] args){
        Father obj=new child2();
        obj.work();
    }
    
}
