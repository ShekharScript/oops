package Inheritance;

public class Box {
    double l, h, w;



    //empty
    public Box() {
        this.l = this.h = this.w  = -1 ;
    }

    //cube
    public Box(double side) {
//        super() ; //this refer to its parent -> Object class
        this.l = this.h = this.w  = side ;
    }

    //cuboid
    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    //another box
    public Box(Box old){
        this.l = old.l ;
        this.h = old.h ;
        this.w = old.w  ;
    }


    public void information(){
        System.out.println("running the boxx");
    }

    public double area(){
        return l*h*w ;
    }
}
