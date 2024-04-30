// Take input from user and return the multiplication of that numbers.

import java.util.Scanner;

class Maths{
    int iValue1;
    int iValue2;

    public Maths(int iVal1, int iVal2){
        System.out.println("inside the constructr.");
        this.iValue1 = iVal1;
        this.iValue2 = iVal2;
    }

    public int Multiplication(){
        System.out.println("inside the multiplication function.");
        int iResult = 0;
        iResult = this.iValue1 * this.iValue2;
        return iResult;
    }
}

class Multiplication {
    // entry point function
    public static void main(String arg[]){
        int iNo1;
        int iNo2;
        int iAns;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iNo2 = sobj.nextInt();

        Maths m = new Maths(iNo1, iNo2);

        System.out.println("Inside main");

        iAns = m.Multiplication();

        System.out.println("Multiplication of " + iNo1 + " and " + iNo2 +  " is : " + iAns);
    }
}
