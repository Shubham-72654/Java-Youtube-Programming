// take value from user and display table of that number
// 5 = 5*4*3*2*1 = 120

import java.util.Scanner;


class Display{
    public void DisplayTable(int no){
        int i = 1;
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------ Table of " + no + " --------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------------");
        
        while(i <= 10){
            System.out.println(i*no);
            i++;
        }
    }

    public int Factorial(int no){
        int fact  = 1;
        //  5, 4, 3, 2, 1, 0
        while(no > 0){
            // 1, 5, 20, 60, 120, 120
            fact = fact * no;
            no = no - 1; // 4, 3, 2, 1, 0
        }

        return fact;
    }
}


class WhileLoop {
    public static void main(String arg[]){
        int no = 0;
        int num = 0;

        Scanner sobj = new Scanner(System.in);
        
        Display obj = new Display();

        System.out.print("Enter the number : ");
        no = sobj.nextInt();

        obj.DisplayTable(no);

        System.out.print("Enter the number for factorial : ");
        num = sobj.nextInt();
        int result = obj.Factorial(num);

        System.out.println("Factorial of " + num + " is " + result);
    }
}
