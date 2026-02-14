class Animal {
    public void speak() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); //polymorphism
        a.speak(); // prints "Bark"
    }
}