package Abstraction;

public abstract class Parent {

    int age ;

    Parent(int age){
        this.age = age ;
        System.out.println("age: " + age);
    }

    abstract void career() ;
    abstract void partner() ;

    //non abstract methods can be written
    void sayhello(){
        System.out.println("hello brother");
    }


    static void who(){
        System.out.println("I am the parent");
    }
}
