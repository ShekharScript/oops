package Enum;

public enum Laptop {
    Macbook(2000), Surface(2200), XPS(), ThinkPad(1800) ;

    private int price ;

    /// sirf ek baar call hoga fot the object XPS() ;
    private Laptop(){
        System.out.println("Inside default constructor");
    }

    /// jitne objects honge utni baar ye constructor call hoga, here 3 times (macbook, surface, thinkpad)
    private Laptop(int price){
        System.out.println("Inside Parameterised constructor");
        this.price = price ;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}


class Demo {
    public static void main(String[] args) {

        Laptop lap = Laptop.Macbook ;


        System.out.println(lap.name() +  " : " + lap.getPrice());
    }
}
