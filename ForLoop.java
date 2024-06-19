// take input from user and display table of that number

import java.util.Scanner;

class NumeberTable{
    public void DisplayTable(int no){
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------ Table of " + no + " --------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------------");
        int i = 0;
        
        for(i = 1; i <= 10; i++){
            System.out.println(i*no);
        }

        System.out.println("Value of i after loop : " + i);
    }
}

class ForLoop{
    public static void main(String arg[]){
        int no = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number that's table you want to print : ");
        no = sobj.nextInt();

        NumeberTable obj = new NumeberTable();
        obj.DisplayTable(no);
    }
}