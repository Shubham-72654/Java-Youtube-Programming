// take 2 numbers as input from user and return the addition of that two numbers in oop with naming convension.

import java.util.Scanner;

class Maths{
    public int Add(int iValue1, int iValue2){
        int iAns = 0;
        iAns = iValue1 + iValue2;
        return iAns;
    }
}

class Addition2 {
    // entry point function
    public static void main(String arg[]){
        int iNo1 = 0;
        int iNo2 = 0;
        int iResult = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        iNo1 = sObj.nextInt();

        System.out.println("Enter the second number : ");
        iNo2 = sObj.nextInt();

        Maths m = new Maths();

        iResult = m.Add(iNo1, iNo2);

        System.out.println("Addition is : " + iResult);
    }
}
