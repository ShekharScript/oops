package Polymorphism;

public class ObjectPrint {
    //w'll override toString method

    int num ;

    public ObjectPrint(int num) {
        this.num = num;
    }

    public final int add(int a, int b){
        return a+b ;
    }

    public int add(int a, int b, int c){
        return a+b+c ;
    }

    static void greetings(){
        System.out.println("hello greetings");
    }


//    @Override
//    public String toString() {
//        return "ObjectPrint{" +
//                "num=" + num +
//                '}';
//    }

    static int i = 5 ;
    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(5) ;
//        System.out.println(obj);

//        System.out.println(obj.add(2,3, 4));

        System.out.println("outer");

        while(i-- > 0 ){
            ObjectPrint.main(new String[]{"hello"}) ;
            System.out.println("inner");
        }

    }
}
