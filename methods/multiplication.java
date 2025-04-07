import java.util.Scanner;
public class multiplication {

    public static void printTable(int number){
        for (int i = 1 ; i<= 10;i++){
        System.out.println(number+"*"+i+"="+(number * i ));
    }}
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ")
        printTable(5);
    }
    
}
