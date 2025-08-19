// Parent class
class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}

// Child class inheriting Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Main class to run the program
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();  // Create object of Dog
        d.eat();           // Inherited method from Animal
        d.bark();          // Own method
    }
}
