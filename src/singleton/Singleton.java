package singleton;

public class Singleton {
    private Singleton(){
        //kuch mat karo bs private bana do constructor ko koi directly access na kar paaye
    }

    private static Singleton instance = null ;
    // share memory hogi es variable ki

    public static Singleton createInstance(){
        if(instance == null) instance = new Singleton() ;
        return instance ;
    }

}
