package Patterns01;
import java.util.*;

public class Pattern01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

//        Print Number pattern
//        for(int i=1; i<=number;i++){
//            for(int y=1;y<=i;y++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Print Character pattern
        char ch = 'A';
        for(int oneChar=1; oneChar<number; oneChar++){
            for(int secChar=1; secChar<=oneChar; secChar++){
                System.out.print(ch );
                ch++;
            }
            System.out.println();
        }
        System.out.println("this is final value of ch: "+ ch);

    }
}