package Demo;

public class Main {

    public static void main(String[] args) {

        System.out.println("this is main class");
        C obj = new C() ;

        //you can check is a object is a instance of class :-
        System.out.println(obj instanceof A);
        System.out.println(obj instanceof B);
        System.out.println(obj instanceof C);

    }

}
