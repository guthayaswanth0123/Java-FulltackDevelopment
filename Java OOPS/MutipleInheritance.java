// class Father {
//     void fatherProperty() {
//         System.out.println("Father gives house");
//     }
// }

// class Mother {
//     void motherProperty() {
//         System.out.println("Mother gives gold");
//     }
// }

// class Child extends Father,Mother { //this is not allowed this is ambiguity 
//     void childProperty() {
//         System.out.println("Child studies");
//     }
// }
// public class MutipleInheritance {

// }




interface Father {
    void fatherProperty();
}
interface Mother {
    void motherProperty();
}

class Child implements Father, Mother {
    public void fatherProperty() {
        System.out.println("Father gives house");
    }
    public void motherProperty() {
        System.out.println("Mother gives gold");
    }
}

public class MutipleInheritance {
    public static void main(String[] args){
        // Child obj=new Child();
        // obj.fatherProperty();
        // obj.motherProperty();
        Father obj=new Child();
        obj.fatherProperty();
        //obj.motherProperty();
    }
}
