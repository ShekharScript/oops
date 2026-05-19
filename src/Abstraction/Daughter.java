package Abstraction;

public class Daughter extends Parent{

    Daughter(int age){
        super(age) ;
        System.out.println("this is daughter age") ;
    }

    //child class must override all the abstract methods in Parent class
    @Override
    void career() {
        System.out.println("I am going to be doctor ");
    }

    @Override
    void partner() {
        System.out.println("I love Tom Curise");
    }

    @Override
    void sayhello(){
        System.out.println("hello daughter");
    }

}
