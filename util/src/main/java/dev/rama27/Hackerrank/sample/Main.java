package dev.rama27.Hackerrank.sample;

public class Main {
    public static void main(String[] args){
        Sub s=new Sub();

    }
}
class Super{
    Super(){
        yo();
    }
    public void yo(){
        System.out.println("YO");
    }
}

class Sub extends Super{
    String name;
    Sub(){
        super();
        name="rama";
        yo();

    }
    public void yo(){
        System.out.println("YO "+name);
    }
}
