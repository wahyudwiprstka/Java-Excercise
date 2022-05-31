abstract class Animal {
    public abstract void speak();
}

class Pig extends Animal{
    @Override
    public void speak() {
        System.out.println("Oink! oink!");
    }
}

class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("Woof! Woof!");
    }
}

class Main{
    public static void main(String[] args) {
        Pig pig = new Pig();
        Dog dog = new Dog();
        pig.speak();
        dog.speak();
    }
}
