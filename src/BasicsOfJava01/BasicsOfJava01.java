package BasicsOfJava01;
import java.util.*;

public class BasicsOfJava01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is Your name: ");
        String name = sc.nextLine();
        System.out.print("Where do you live: ");
        String location = sc.nextLine();
        System.out.print("What is your age: ");
        int age = sc.nextInt();
        System.out.println("My name is "+ name+ " i live in "+ location+ " My age is: "+ age);
    }
}