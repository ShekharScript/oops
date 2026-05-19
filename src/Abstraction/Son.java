package Abstraction;

public class Son extends Parent{
    //child class must override all the abstract methods in Parent class

    Son(int age){
        super(age) ;
        System.out.println("this is son age") ;
    }

    @Override
    void career() {
        System.out.println("I am going to be coder ");
    }

    @Override
    void partner() {
        System.out.println("I love gal gadot");
    }
}
