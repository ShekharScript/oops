package Demo;

public class C extends B{
    int c ;

   C(){
       super() ;
       c = 2 ;
       System.out.println("this is C class constructor :" + super.a);
   }
}
