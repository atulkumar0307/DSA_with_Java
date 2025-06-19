package FunctionsAndMethods03;

import java.util.*;

public class DecimalToBinary03 {

    public static int DecimalToBinary(int dec){
        int bin = 0;
        int pow = 0;
        while(dec > 0){
            int remainder = dec%2;
            bin  = bin + (remainder * (int)Math.pow(10, pow));  //  to set the value from ones to ..., depends on power.
            pow++;
            dec = dec/2;
        }
        return bin;
    }

    public static void main(String[] args){
        System.out.print("Enter Decimal number: ");
        Scanner sc = new Scanner(System.in);
        int binaryNumber = sc.nextInt();
        int result = DecimalToBinary(binaryNumber);
        System.out.println("Binary Number: " + result);
    }

}
