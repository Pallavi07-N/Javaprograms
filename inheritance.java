// Base class (superclass)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (subclass)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test inheritance
public class TestInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Inherited method from Animal
        dog.eat();   // Output: This animal eats food.
        
        // Method specific to Dog
        dog.bark();  // Output: The dog barks.
    }
}
