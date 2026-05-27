package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/// java.lang is auto imported no need to explicitly import but java.io.something needs to be imported

public class oldMethod {
    public static void main(String[] args) {
        /// how to take input ?

        System.out.println(); ///this way you can print easily

        /// earlier method:
        //read it from bottom to up

        //up
        /// InputStreamReader wants a InputStream object which we know 'in' -> static object of InputStream class declared inside System class
        /// this System.in is we are telling where we are taking input from
        ///buffered Reader constructor wants a Reader-object so,
        InputStreamReader in = new InputStreamReader(System.in) ;


        BufferedReader bf = new BufferedReader(in) ;
        /// bufferedReader(s) can take input form anywhere like keyboard, files, network
        //bottom

        /// now I can use BufferedReader object bf to take input
        try{
//            bf.readLine() ; //better than just read()
            ///this method return a String but let's say we want a value so,
            System.out.println("Enter a Value : ");
            int num = Integer.parseInt(bf.readLine()) ;
            System.out.println(num);

            bf.close(); ///not a mandatory step
            /// bufferedReader needs to be closed since it is connected to a resource like a file , network , a database, keyboard input
            /// also we need to release the resource
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){ /// from Integer.parseInt()
            System.out.println(e);
        }

    }
}
