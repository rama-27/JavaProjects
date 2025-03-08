package dev.rama27.WaysToClass;

// using new keyword
public class First {

    public static void main(String args[]){
        A a = new A();
        B b= new B();
        try {
            B obj = (B) b.clone();
        }
        catch (CloneNotSupportedException e){
            System.out.println("Clone not supported");
        }
    }
}
class A {
    int a;

}

class B{
   double b;

   @Override
   protected Object clone() throws CloneNotSupportedException{
       return super.clone();

   }

}