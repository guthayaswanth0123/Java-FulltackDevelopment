


// Types of Inner Classes

// Java mainly has 4 types:
// Member Inner Class
// Static Nested Class
// Local Inner Class
// Anonymous Inner Class


class A {

    int age;

    public void show() {
        System.out.println("inside show");
    }

    class B {

        public void config() {
            System.out.println("inside config");
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {

        // Outer class object
        A obj1 = new A();

        obj1.show();

        // Inner class object
        A.B obj2 = obj1.new B();

        obj2.config();
    }
}
