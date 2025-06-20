package FunctionsAndMethods03;
import java.util.*;

public class Practice {

    public static int binaryToDecimal(int num){
        int pow = 0;
        int dec = 0;
        while (num > 0) {
            int lastDigit = num % 10;  // to get last digit of number.
            dec = dec + (lastDigit * (int)Math.pow(2, pow));    //
            num = num/10; // to remove last digit of number.
            pow++;
        }
        return dec;
    }

    public static int decimalToBinary(int num){
        int pow = 0;
        int bin = 0;
        while (num > 0) {
            int remainder = num % 2;    // to find remainder.
            bin = bin + ((int)Math.pow(10, pow) * remainder); // to place digit on ones then to right...
            pow++;
            num = num/2;
        }
        return bin;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        Binary to Decimal
//        System.out.print("Enter Binary: ");
//        int binaryNumber = sc.nextInt();
//        int decimalNumber = binaryToDecimal(binaryNumber);
//        System.out.println("Decimal of "+ binaryNumber+ " is: "+ decimalNumber);

//        Decimal to Binary
        System.out.print("Enter Decimal: ");
        int decimalNumber = sc.nextInt();
        int binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary of "+ decimalNumber+ " is: "+ binaryNumber);
    }
}
