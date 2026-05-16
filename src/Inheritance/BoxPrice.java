package Inheritance;

public class BoxPrice extends BoxWeight {
    double cost ;

    public BoxPrice() {
        super() ;
        this.cost = -1 ;
    }

    BoxPrice(BoxPrice other){
//        super(other) ;
    }


    public BoxPrice(double l, double h, double w, double weight, int cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
}
