
///An anonymous object is an object that is created without storing it in a reference variable.
/// When you need the object only once, you can use an anonymous object.
/// 
/// 
/// MODIFIERS
// Modifier	Same Class	  Same Package	 Child Class    Other Package
// private	        ✅	         ❌	          ❌	            ❌
// default	        ✅	         ✅	          ❌*	        ❌
// protected	    ✅	         ✅	          ✅	            ❌*
// public	        ✅	         ✅	          ✅	            ✅


class Student {
    void display() {
        System.out.println("Hello Student");
    }
}
public class AnnonymousObject {
    public static void main(String[] args) {
        new Student().display();
    }
}




// final Keyword in Java
// The final keyword means "cannot be changed".
// We mainly use final in 3 places:
// final variable
// final method
// final class

// final Variable

// A final variable cannot be reassigned after giving it a value.



//2. final Method

//A final method cannot be overridden by a child class.


// 3. final Class

//A final class cannot be inherited.