package dev.rama27.Learn.Inheritance;

class A2{
    void display(){
        System.out.println("Displaying from A2");
    }
}
class B2 extends A2{
    void display1(){
        System.out.println("Displaying from B2");
    }
}
class C2 extends A2{
    void display1(){
        System.out.println("Displaying from C2");
    }
}
public class HeirarichalInheritance {
    public static void main(String[] args) {
        B2 b = new B2();
        C2 c = new C2();
        b.display();
        b.display1();
        c.display();
        c.display1();
    }
}
