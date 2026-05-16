package Inheritance;

public class BoxWeight extends Box{
    double weight ;

    public BoxWeight() {
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //used initialise values in the parent class
        this.weight = weight;
    }
}
