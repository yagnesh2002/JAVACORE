
// method called add take two numbers as input and print theire sum 
import java.util.Scanner;
public class firstt{
    public static void add (int num1 , int num2 ){
        int sum = num1 + num2;
        System.out.println("THE SUM IS : " + sum );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        for ( int i = 1; i<=3;i++);
        System.out.print("ENTER THE NUMBER : " );
        int num1 = sc.nextInt();
        System.out.print("Enter the num2 : ");
        int num2 = sc.nextInt();
        add (num1 ,num2);
       
    }}













    /* 
    public static void add(int num1,int num2){
        int sum = num1 + num2;
        System.out.println("THE SUM IS : " + sum);
    }
    public static void main(String []args ){
        Scanner sc = new Scanner ( System.in);
        for ( int i = 1 ; i <= 3 ; i++);
        System.out.print("ENTER THE NUM1 : ");
        int num1 = sc.nextInt();
        System.out.print("ENTER THE NUM 2 : ");
        int num2 = sc.nextInt();
        add (num1 ,num2);
    }
}




































/* 
public class firstt{
    public static void add(double num1 ,double num2){
        double sum = num1 + num2 ;
        System.out.println("THE SUM : " + sum);

     } 
     public static void main(String []args){
        Scanner sc = new Scanner (System.in);

        for ( double i = 1 ; i <= 4 ;i ++){
            System.out.print("ENTER NUM1 : ");
            double num1 = sc.nextDouble();
            System.out.print("Enter num2 : ");
            double num2 = sc.nextDouble();


            add (num1,num2);
        }


     }
}



























/* 
 // method called add take two numbers as input and print theire sum 


import java.util.Scanner;
public class firstt { 
        // Define a method 
    public static void add(int num1 ,int num2 ){
        int sum = num1 + num2;
        System.out.println("THE SUM IS :" + sum);

    }
    // main method
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);

        for( int i  = 1; i <= 3; i++){
        System.out.println("ENTER NUM 1 : " + i + " :");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 : " + i + " : ");
        int num2 = sc.nextInt();

        add (num1 ,num2);        
      

    }

   
      
         
        
        
    }



}








           // greeting program that takes a name as an argument and prints a personalized welcome message.


      /* 
              public static void greet(String name){
                 System.out.println("HELLO " + name + "  ! NICE TO MEET YOU !!!!!");

                }
                 public static void main(String []args){
                     greet ("ALICE");
                     greet ("BOB");
    }


   
   
   
   
   
   
   
   
}
   


























   /* 
    // Define a method with parameters 
    public static void greet(String name) {
        System.out.println("Hello," +name+ " ! NICE TO MEET YOU !!");
    } 
    // Main Method
    public static void main(String[] args) {
        greet("ALICE");
        greet("BOB");
        
    }


}































/* //
     
   
    defines a method then calls this method from the main method.


    public static void Sayhello(){
        System.out.println("HELLO WORLD");

    }
    public static void main(String[]args){
        Sayhello();

    }
    
}
/* */