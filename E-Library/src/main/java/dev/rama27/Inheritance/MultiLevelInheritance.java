package dev.rama27.Inheritance;

class GrandParent{

    void display(){
        System.out.println("GRANDPARENT CLASSS STUFF");
    }
}
class Parent1 extends GrandParent{
    void display1(){
        System.out.println("PARENT CLASS STUFF");
    }
}
class child1 extends Parent1{
    void display2(){
        System.out.println("CHILD CLASS STUFF");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        child1 child = new child1();
        child.display();// accesing grandparent class method
        child.display1();// accesing parent class method
        child.display2();// accesing child class method
    }
}
