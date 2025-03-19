package dev.rama27.Learn.Inheritance;


class Parent{
    int i;
    void display(){
        System.out.println("PARENT CLASS STUFF");
    }
}

class Child extends Parent{

}
public class SingleLevelInheritance {
    public static void main(String[] args) {

        Child child = new Child();
        child.display();
        
    }
}
