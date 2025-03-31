package dev.rama27.Learn.Generics;

import java.util.ArrayList;
import java.util.List;

class Container<T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void getInfo(){
        System.out.println(value.getClass().getName());
    }
    public void passParameters(ArrayList<? extends T> a){
        for(T i: a){
            System.out.print(i+" ");
        }
    }
    public void passParametersSuper(ArrayList<? extends T> a){
        for(T i: a){
            System.out.print(i+" ");
        }
    }

}
public class sample {

    public static void main(String[] args){
        Container<Number> c=new Container<>();
        c.setValue(43);

        c.getInfo();
        c.passParameters(new ArrayList<Float>());
    }


}
