package FunctionsAndMethods03;
import java.util.*;
public class BinaryToDecimal02 {

    public static int binaryToDecimal(int bin){
        int pow = 0;
        int dec = 0;
        int binaryNumber = bin;
        while(bin>0){
            int lastDigit = bin % 10;   // To get last digit of the number.
            dec = dec + (lastDigit * (int)Math.pow(2, pow));    // mat.pow always return double value, so we need to typecast to int.
            pow++;
            bin = bin/10;   // to remove last digit of number.
        }
        return dec;
    }

    public static void main(String[] args){
        System.out.print("Enter Binary number: ");
        Scanner sc = new Scanner(System.in);
        int binaryNumber = sc.nextInt();
        int result = binaryToDecimal(binaryNumber);
        System.out.println("Decimal Number: " + result);
    }
}
