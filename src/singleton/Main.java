package singleton;

public class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.createInstance()  ;
        Singleton obj2 = Singleton.createInstance()  ;
        Singleton obj3 = Singleton.createInstance()  ;

        //obj sirf ek hi baar create hoga

        //how will u know ki ye teeno ek hi instance ko refer kar rhe h
        System.out.println(obj1 == obj2);
        System.out.println(obj2 == obj3);


    }
}
