package dev.rama27.Learn.Super;

class Fruits{
    Fruits(){
        System.out.println("Fruits constructor called");
    }
    Fruits(int a){
        System.out.println("Fruits args constructor called");
}
    public void display(){
        System.out.println("fruits are sweet ig ");
    }
}

class Apple extends Fruits{
    Apple(){
//        super();// calls the no args constructor of fruits
        super(39);// u can call only one constructor of parent class
    }
    public void display() {
        super.display();// calls the display method of fruits class
        System.out.println("Apple is red in color");
    }

}
public class Sample {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.display();
    }

}
