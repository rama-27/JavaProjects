package dev.rama27.Learn.Exception;

public class ExceptionHandling {

    public static void main(String[] args) throws NotElgible{
        String s="yo";
        nullEx(s);
        division(4,1);
        int age=19;
        customException(age);
    }
    public static void division(int a, int b){
        int c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException ae){
            // error message toString
            // ae.toString() return className of exception and message
            System.out.println(ae.toString());
        }
        finally {
            System.out.println("code executed regardless of exception !!");
        }
    }

    public static void nullEx(String s) {
        try{
        System.out.println(s.length());
        }
        catch(NullPointerException npe){
            System.out.println(npe.toString());
        }
        finally {
            System.out.println("code executed regardless of exception !!");
        }
    }

    public static void customException(int a) throws NotElgible{
        if(a>18){
            System.out.println("No problem");
        }
        else{
            throw new NotElgible("less than 18 !");
        }
    }
}
