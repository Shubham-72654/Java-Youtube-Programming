// take 2 numbers as input from user and return the addition of that two numbers in oop with naming convension and with use of constructor.

import java.util.Scanner;

class Maths{
    public int iNum1 = 0;
    public int iNum2 = 0;

    public Maths(int iValue1, int iValue2){
        this.iNum1 = iValue1;
        this.iNum2 = iValue2;
    }

    public int Add(){
        int iAns = 0;
        iAns = this.iNum1 + this.iNum2;
        return iAns;
    }

    public int Sub(){
        int iAns = 0;

        if(this.iNum1 > this.iNum2){
            iAns = this.iNum1 - this.iNum2;
            return iAns;
        } 
        iAns = this.iNum2 - this.iNum1;
        return iAns;
    }
}

class Addition4 {
    // entry point function
    public static void main(String arg[]){
        int iNo1 = 0;
        int iNo2 = 0;
        int iResult = 0;
        int iResult2 = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        iNo1 = sObj.nextInt();

        System.out.println("Enter the second number : ");
        iNo2 = sObj.nextInt();

        Maths m = new Maths(iNo1, iNo2);

        iResult = m.Add();
        iResult2 = m.Sub();
        
        System.out.println("Addition is : " + iResult);
        System.out.println("Substraction is : " + iResult2);
    }
}
