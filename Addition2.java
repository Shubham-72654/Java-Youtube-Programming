// take 2 numbers as input from user and return the addition of that two numbers in oop.

import java.util.Scanner;

class Maths{
    public int Add(int no1, int no2){
        return no1 + no2;
    }
}

class Addition2 {
    // entry point function
    public static void main(String arg[]){
        int no1 = 0;
        int no2 = 0;
        int result = 0;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        no1 = obj.nextInt();

        System.out.println("Enter the second number : ");
        no2 = obj.nextInt();

        Maths m = new Maths();

        result = m.Add(no1, no2);

        System.out.println("Addition is : " + result);
    }
}
