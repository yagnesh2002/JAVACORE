import java.util.Scanner;
public class evenodd {
    public static void iseven( int number){
        if ( number % 2 ==0){
            System.out.println(number + " iseven ");
        }else {
            System.out.println(number + " isodd");
        }
    }
    public static void main(String []args ){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        iseven( number );
        
    }
    
}
