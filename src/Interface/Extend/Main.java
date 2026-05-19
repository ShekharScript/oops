package Interface.Extend;

//B extends A and Main implements B
//so you have to override all methods of A and B
public class Main implements B {

    @Override
    public void greet() {
        System.out.println("hello  greetings");
    }

    @Override
    public void fun() {
        System.out.println("we are having fun");
    }

    public static void main(String[] args) {
        Main obj = new Main() ;
        obj.greet();
        obj.fun() ;
    }
}
