// Base class
class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}

// Derived from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Derived from Dog
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping.");
    }
}

// Main class to run the program
public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy(); // Create object of Puppy
        p.eat(); // From Animal
        p.bark(); // From Dog
        p.weep(); // From Puppy
    }
}
