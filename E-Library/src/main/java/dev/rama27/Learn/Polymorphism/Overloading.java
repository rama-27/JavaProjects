package dev.rama27.Learn.Polymorphism;

public class Overloading {
    //overloading can be done to methods with different parameters
    // like distinct number of parameters, different data types of parameters, different sequence of parameters
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.display();
        obj.display(3);
        }
    public void display(){
        System.out.println("Display method without any parameter");
    }
    private int display(int a){
        System.out.println("Display method with int parameter "+a);
        return a;
    }
}
