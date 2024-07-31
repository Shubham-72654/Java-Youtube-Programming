// Problem statement - 
// check wether number is palindrome or not.
// palindrome -> same as forward and backward => 12321, 1432341, 1331, 43534

import java.util.Scanner;

class Check{
    public boolean checkPalindrome(int iNum){

        int iTemp = iNum;
        int iNew = 0;
        int iDigit = 0;
        
        while(iTemp != 0){
            iDigit = iTemp % 10;   // (12321 % 10 = 1) (1232 % 10 = 2) (123 % 10 = 3) (12 % 10 = 2) (1 % 10 = 1)
            iNew = iNew * 10 + iDigit;  // (0 * 10 + 1 = 1) (1 * 10 + 2 = 12) (12 * 10 + 3 = 123) (123 * 10 + 2 = 1232) (1232 * 10 + 1 = 12321)
            iTemp = iTemp / 10;  // (12321 / 10 = 1232) (1232 / 10 = 123) (123 / 10 = 12) (12 / 10 = 1) (1 / 10 = 0)
        }

        if(iNum == iNew){
            return true;
        }
        return false;
    }
}


class Palindrome{
    public static void main(String arg[]){
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter any number to check wether number is palindrome or not : ");
        iNo = sobj.nextInt();

        Check obj = new Check();
        bRet = obj.checkPalindrome(iNo);

        if(bRet == true){
            System.out.println(iNo + " Number is palindrome.");
        }else{
            System.out.println(iNo + " Number is not palindrome.");
        }
    }
}