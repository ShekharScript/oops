package Input;

import java.util.Scanner;

public class NewMethod {
    public static void main(String[] args) {
        /// Scanner are slow comparatively and has a major issue they do not consume new line content but bufferedReader do
        ///  shown the issue below

        Scanner sc = new Scanner(System.in) ;
        /// System.in is we are specifying from where we are trying to take input i.e from console, file, network

        System.out.println("Enter num : ");
        int num = sc.nextInt() ;

        System.out.println("Enter num2 in : ");
        /// when you enter value like 50 for num then press enter toh buffer newline ('\n') character
        /// chla gya then tumne Integer.parseInt(\n) krdia -> will throw error
        int num2 = Integer.parseInt(sc.nextLine()) ;

//        but this can be managed

    }
}
