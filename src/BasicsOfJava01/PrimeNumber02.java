package BasicsOfJava01;
import java.util.*;

public class PrimeNumber02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Prime: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Is Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}