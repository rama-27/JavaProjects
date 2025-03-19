package dev.rama27.Learn.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();// sound method of Dog class will be called
        dog.toCallSound();// using super we can call the sound method of Animal class

    }
}

class Animal{
    public void sound(){
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal{
    // Overriding the sound method of Animal class
    public void sound(){
        System.out.println("Dog is barking");

    }
    public void toCallSound(){
        super.sound();
    }
}
