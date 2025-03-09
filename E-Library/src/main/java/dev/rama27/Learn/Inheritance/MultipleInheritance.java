package dev.rama27.Learn.Inheritance;

interface A{
     default void display(){
        System.out.println("Displaying from A Interface");
    }
}
interface B{
    default void display(){
        System.out.println("Displaying from B Interface");
    }
}
class C implements A,B{
    @Override
    public void display() {
        A.super.display();  // or u can do both too one after other in this case
        B.super.display();  // u can choose which interface to implement
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.display();
    }
}
