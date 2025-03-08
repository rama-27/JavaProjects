package dev.rama27.WaysToClass;

import java.io.*;

public class Second {
    public static void main(String args[]){
        // here we are using deserialization to create an object ;)
        // all we do is create an object from a file which is properly serialized class
        // 1) what is serilization?

     //   /*

       try{
            Student s=new Student(1, "rama");

            FileOutputStream fileout =new FileOutputStream("data/student.id");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(s);
            out.close();

            FileInputStream filein=new FileInputStream("data/student.id");
            ObjectInputStream in = new ObjectInputStream(filein);
            Student des=(Student) in.readObject();
            in.close();
            filein.close();
            System.out.println("Deserialized Student...");
           System.out.println("Name: "+des.name());
           System.out.println("id: "+des.id());

        }
        catch (Exception e){
            System.out.println("Exception is "+e);
        }
     //    */

        By b=new By() {
            @Override
            public void full() {
                System.out.println(i);
            }
        };
        b.full();
    }
    YO y;

    {
        try {
            y = YO.class.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

record Student(int id, String name) implements Serializable {
    private static final long serialVersionUID = 1L;
}

class YO{

    int a;
}
interface By{
    int i = 0;
    void full();
}