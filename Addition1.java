// take 2 numbers from user and addition of that numbers.

import java.lang.*;
import java.util.Scanner;

class Addition1 {
    // entry point function
    public static void main(String arg[]){

        // variable initialization
        int result = 0;
        int no1 = 0;
        int no2 = 0;

        
        // Object creation of Scanner class for taking input from user
        // System.in means take input from keyboard in system.
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the first number : ");

        // taken value from user convert in integer and store in no1
        no1 = obj.nextInt();
        
        System.out.print("Enter the second number : ");
        no2 = obj.nextInt();

        // addition of no1 and no2
        result = no1 + no2;

        System.out.println("Addition is : " + result);
    }
}
