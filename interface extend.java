// Encapsulated class
class Person {
    // private fields: hidden from outside access
    private String name;
    private int age;

    // setter with validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    // setter with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        }
    }

    // getters to retrieve values
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Demo class
public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        // Attempt invalid assignments:
        p.setName("");    // ignored
        p.setAge(-5);     // ignored

        // Valid assignments:
        p.setName("Alice");
        p.setAge(30);

        // Access values via getters
        System.out.println("Name: " + p.getName()); // Alice
        System.out.println("Age: " + p.getAge());   // 30
    }
}
