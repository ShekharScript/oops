package Exceptions;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

//creating my own exception
class MyException extends Exception{
    public MyException(String s) {
        super(s) ;
    }
}


public class Demo {
    public static void main(String[] args) {

        //checked exception
        try{
            Class.forName("Exceptions.Demo") ;
            Class.forName("Exceptions.abcd") ;
        }catch(ClassNotFoundException e){
            System.out.println("class not found : " + e.getMessage());
        }




        int i = 1 ;
        int j = 0;
        int[] arr = new int[5] ;
        String str = null ;

        try { ///critical statements
            if(j==0){
                throw new ArithmeticException("you done a mistake") ;
            }
            j = 18 / i ; ///this is a critical statement since i can be zero
            System.out.println(str.length()); ///null pointer exception
            j = arr[5] ;
        } catch (ArithmeticException e) {
            System.out.println("hello cannot divide by zero, " + e.getMessage());
        } catch (IndexOutOfBoundsException e){
            System.out.println("hello index out of bound, " + e.getMessage());
        } catch (Exception e){
            //this parent exception should be handled at the end
            //if written at then the sub-exceptions handled below will never be unreachable
            //since all exception can be handled by the parent Exception itself
            //if not sure what type of exception may arise then use this General Exception class
            System.out.println("something went wrong, " + e);
        }

        System.out.println();
        System.out.println("after try catch block");





        //using my own exception
        int a = 10 ;
        int b = 0 ;

        try{
            if(b == 0){
                throw new MyException("this is custom expception") ;
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
