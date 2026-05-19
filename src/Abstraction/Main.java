package Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23) ;
        son.career();
        son.partner();
        son.sayhello();

        Daughter daughter = new Daughter(24) ;
        daughter.career();
        daughter.partner();
        daughter.sayhello();

//        Parent parent = new Daughter(40) ;
//        parent.sayhello();
        
        
//        Parent parent = new Parent(40) ;
//        cannot create object of abstract class

        System.out.println();
        Parent.who();
    }
}
