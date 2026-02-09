import java.util.Scanner;
public class Ncast {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        double myDouble = 9.78d;
        int myInt = (int) myDouble; //Manual casting :- double to int 

        System.out.println(myDouble); // Output 9.78
        System.out.println(myInt); // Output 9

        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Using scanner :- "+(x*y));

        char A = 'A';
        char B = 'B';

        System.out.println(A & B);
        System.out.println(A | B);
        System.out.println(A ^ B);
        System.out.println(~A);
        System.out.println(A << 2);
        System.out.println(A >> 2);
        System.out.println(A >>> 2);
    }    
}
