package Enum;

public enum Status {
    Running, Pending, Failed, Success
}

class Test{
    public static void main(String[] args) {
        Status s = Status.Success ;
        System.out.println(s.ordinal());

        System.out.println(s.name());

        System.out.println(s.getClass().getSuperclass()) ;
    }

}
