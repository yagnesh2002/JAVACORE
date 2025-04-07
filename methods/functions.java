
import java.util.Scanner;
public class functions{
    public static  int addNumbers (int a,int b){
        return a +b ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THE NUMBER : ");
        int a = sc.nextInt();
        System.out.println("Enter the number 2 ");
        int b = sc.nextInt();
        
        int result = addNumbers (a,b);
        System.out.println("THE SUM IS : " + result );
        
    }
}






















/* 
public class functions{
    public static void greet(String name){
        System.out.println("HELLO " + name + " !!!");
        }
        public static void main(String[] args) {
            greet ("ALICE ");

            
        }
    }


























/* 
public class functions {

    // defining a method 

    public static void greet (){
        System.out.println("HELLO WORLD ");
    }
    public static void main(String[] args) {

        // calling a method 
        greet();
        

        
    }
}

    
 */
