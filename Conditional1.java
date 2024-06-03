// if else statement
// accept number from user and check wether number is positive or negative.

import java.util.Scanner;

class ChkNumber{
    int iValue = 0;

    public ChkNumber(int iNo){
        this.iValue = iNo;
    }

    public void ChkPositiveNegative(){
        if(this.iValue >= 0){
            System.out.println(this.iValue + " is a positive number.");
        } else {
            System.out.println(this.iValue + " is a negative number.");
        }
    }
}

class Conditional1 {
    public static void main(String arg[]){
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter any number : ");
        iNo = sobj.nextInt();

        ChkNumber cobj = new ChkNumber(iNo);
        cobj.ChkPositiveNegative();
    }
}
