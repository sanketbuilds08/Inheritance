// Parent class
class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}

// Child 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Child 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Main class to run the program
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // From Animal
        d.bark(); // From Dog

        Cat c = new Cat();
        c.eat(); // From Animal
        c.meow(); // From Cat
    }
}
