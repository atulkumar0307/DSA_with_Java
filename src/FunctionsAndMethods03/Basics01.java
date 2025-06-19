package FunctionsAndMethods03;
import java.util.Scanner;

public class Basics01 {

    public static void introduction(){      //function definition + parameters/actual parameters.
        System.out.println(" This calculation is being initialized by using function.");
        return;
    }

    public static int calculateSum(int a, int b){   // call by value
        return a+b;
    }

    public static int factorial(int a){      // factorial
        int result = 1;
        for(int i=a; i>=1; i--){
            result = result*i;
        }
        return result;
    }

    public static int binomialCoefficient(int n, int r){    // function calling function
        return factorial(n)/(factorial(r)*factorial((n-r)));
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args){
//        introduction(); // function calling
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a: ");
//        int a = sc.nextInt();
//        System.out.print("Enter b: ");
//        int b = sc.nextInt();
//        int result = calculateSum(a, b);    // function calling + arguments/actual parameters.
//        System.out.println("Sum is: "+ result);

//        System.out.print("Enter number to find factorial: ");
//        int number = sc.nextInt();
//        int result = factorial(number);
//        System.out.println("Factorial of " + number + " is: " + result);

//        System.out.print("Enter value of N: ");
//        int n = sc.nextInt();
//        System.out.print("Enter value of R: ");
//        int r = sc.nextInt();
//        int result = binomialCoefficient(n , r);
//        System.out.println("Binomial Coefficient: "+ result);

//        System.out.print(sum(2, 3));

    }
}
