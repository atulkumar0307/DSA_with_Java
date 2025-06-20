package Array04;

import java.util.Scanner;

public class LinearSearch02 {

    public static int linearSearch(int []num, int value){
        for(int i=0; i<num.length; i++){
            if(num[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(String []num, String value){
        for(int i=0; i<num.length; i++){
            if(num[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] numbers = {2, 4, 5, 6, 7, 23, 5, 9, 12, 19};
        String[] fruits = {"Mango", "Apple", "Kiwi", "Pineapple", "Sugarcane"};
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter Number to search: ");
//        int value = sc.nextInt();

        System.out.print("Enter Fruit name to search: ");
        String value = sc.next();

        int position = linearSearch(fruits, value);

        if(position<0){
            System.out.println(value+ " not found.");
        }else{
            System.out.println(value + " found at index: "+ position);
        }
    }
}
