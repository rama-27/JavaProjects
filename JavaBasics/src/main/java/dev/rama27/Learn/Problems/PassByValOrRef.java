package dev.rama27.Learn.Problems;

public class PassByValOrRef {
    public static void main(String[] args){

        Dog aDog=new Dog("snoppy");
        Dog oldDog=aDog;
        oldDog.setName("yohho");
        System.out.println(aDog.name);
        oldDog.dogg(oldDog);
        System.out.println(oldDog.name);
    }


}

class Dog{
    public String name;
    Dog(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void dogg(Dog a){
        Dog b=new Dog("b");
        a=b;
        System.out.println(a.name);
    }
}
