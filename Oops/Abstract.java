 //public class Abstact {
//     public static void main(String[] args) {
    //     Abstact outer = new Abstact(); // Create an instance of the outer class

    //     Horse h = outer.new Horse(); // Create an instance/object of the inner class Horse
    //     h.eat();
    //     h.walk();

    //     chicken c = outer.new chicken(); // Create an instance of the inner class chicken
    //     c.walk();
    //     c.eat();

    //     //animal a = new animal();   //if we try to create an instance type of abstract class of animal it will show error
    // }
// }


    // abstract class animal {
    //     void eat() {        //Non abstract method
    //         System.out.println("This animal eats food.");
    //     }

    //     abstract void walk();    //abstract method
    // }

    // class Horse extends animal {
    
    //     void walk() {
    //         System.out.println("Horse walks on 4 legs.");
    //     }
    // }

    // class chicken extends animal {
        
    //     void walk() {
    //         System.out.println("Chicken walks on 2 legs.");
    //     }










//---------------------> Constructors use in abstract class
public class Abstract {
    public static void main(String[] args) {
        Mustang myhorse = new Mustang(); // object of mustang created //Even if we create object of child class like mustang here, Constructor of parent class would be called first then child 1 child 2
    }
}




abstract class animal {
    animal() { // Constructor
        System.out.println("animal constructor called");
    }

    void eat() { // Non-abstract method
        System.out.println("This animal eats food.");
    }

    abstract void walk(); // Abstract method to be defined in subclasses
}


class Horse extends animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void walk() {
        System.out.println("Horse walks on 4 legs."); // Abstract method defined
    }
}


class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }

    void walk() {
        System.out.println("Mustang walks on 4 legs.");
    }
}





