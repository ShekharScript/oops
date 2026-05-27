package Interface;

interface Functional_Interface{
        int show(int a, int b, int c, int d) ;
}

class Test{
    public static void main(String[] args) {
//        Functional_Interface obj = new Functional_Interface() {
//            @Override
//            public int show(int a, int b) {
//                System.out.println("functional interface implemented using anonymous inner class");
//                    return a+b ;
//            }
//        };
//
//        obj.show();


        Functional_Interface obj = (a, b,  c , d) ->{ return a+b+c+d ; }  ;
        System.out.println(obj.show(5,6 , 9, 9));
    }
}