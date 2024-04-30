// accept two numbers from user and return division value.

import java.util.Scanner;

class Maths{
    float iValue1;
    float iValue2;

    public Maths(float iNo1, float iNo2){
        this.iValue1 = iNo1;
        this.iValue2 = iNo2;
    }

    public float Division(){
        float iResult;
        iResult = iValue1 / iValue2;
        return iResult;
    }
}

class Division {
    // entry point function
    public static void main(String arg[]){
        float iNo1;
        float iNo2;
        float fAns;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iNo1 = sobj.nextFloat();
        
        System.out.println("Enter second number : ");
        iNo2 = sobj.nextFloat();

        Maths m = new Maths(iNo1, iNo2);
        fAns = m.Division();

        System.out.println("Division is : " + fAns);
    }
}
