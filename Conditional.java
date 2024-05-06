// conditional statement => use of "if"
// accept two numbers from user and return the greatest/largest value.
import java.util.Scanner;

class ChkNumber{
    int iValue1;
    int iValue2;

    public ChkNumber(int iNo1, int iNo2){
        this.iValue1 = iNo1;
        this.iValue2 = iNo2;
    }

    public int findLargest(){
        int iLarge;
        iLarge = this.iValue2;
        // 17, 15
        if(this.iValue1 > this.iValue2){
            iLarge = iValue1;
        }
        return iLarge;
    }
}

class Conditional{
    public static void main(String arg[]){
        int iNo1;
        int iNo2;
        int iRet;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iNo2 = sobj.nextInt();

        ChkNumber cobj = new ChkNumber(iNo1, iNo2);
        iRet = cobj.findLargest();

        System.out.println("Largest number is : " + iRet);
    }
}