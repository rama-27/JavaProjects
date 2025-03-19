package dev.rama27.Learn.AbstractStuff;

public abstract class AbstractClass {

    int pi=10;
    // the variables declared in abstractclass are not final or static by default u have to specify it
    void run() {
        System.out.println("YOO");
        pi=6;
    };
    abstract public void starts();
}
class Main extends AbstractClass{

    public void starts() {

    }
}

interface yo{
    int pi=43;
    public final static int y=5;

    // int pi ==> public final static int pi

    int run();
    abstract int run2();
    public abstract int run3();

    // int run() => public abstract int run()
    // so public abstract are applied to var as default


    // if u use default u can implement the 
    default void hahha(){
    }
}
