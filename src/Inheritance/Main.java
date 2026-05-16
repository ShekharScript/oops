package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box b = new Box() ;
//        System.out.println(b.l + " " + b.h + " " + b.w);

//        Box box1 = new Box (4.6, 7.9, 9.9);
//        Box box2 = new Box (box1);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);

//        boxWeight box3 = new boxWeight() ;
//        boxWeight box4 = new boxWeight( 2, 3, 4,  8);
//        System.out.println(box3.h + " " + box3. weight) ;

//        Box b5 = new boxWeight(2,3,4,8) ;
//        System.out.println(b5.weight); ////not allowed

/// there are many variables in both parent and child classes
/// you are given access to variables that are in the ref type i.e. Boxweight
/// hence, you should have access to weight variable
/// this also means, that the ones you are trying to access should be initialised
/// but here, when the obj itself is of type parent class, how will you call the constructor of child class
//        boxWeight box6 =  new Box( 2, 3, 4) ;
    }
}
