
import java.util.Scanner ;
public class factorial {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<= n;i ++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THE NUMBER : ");
        int number = sc.nextInt();
       
        int result = factorial(number);
        System.out.println("THE FACTORIAL IS : " + result );
      
    }
}
