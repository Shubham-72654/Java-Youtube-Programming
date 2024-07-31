// Armstrong number
// 153 = 1^3 + 5^3 + 3^3 = 153
// 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1634

// 93084 = 9^5 + 3^5 + 0^5 + 8^5 + 4^5
    //   59049 + 243 + 0  + 32768 + 1024 


import java.util.Scanner;

class Check{
    public boolean checkArmstrong(int iNum){

        int iTemp = iNum;
        int iNew = 0;
        int iMult = 0;
        int iDigit = 0;
        int iDigCnt = 0;

        // 153
        while(iTemp != 0){
            iDigCnt++; // 1 2 3
            iTemp = iTemp / 10;
        }

        // iDigCnt = 3
        iTemp = iNum;

        while(iTemp != 0){
            iDigit = iTemp % 10;  // 3 5 1
            iMult = 1;

            for(int iCnt = 1; iCnt <= iDigCnt; iCnt++){
                iMult = iMult * iDigit; // (1*3) (3*3) (9*3)
                                        // (1*5) (5*5) (25*5)
                                        // (1*1) (1*1) (1*1)
            }

            iTemp = iTemp / 10; // 15 1 0

            iNew = iNew + iMult;  // 27 + 125 + 1 = 153
        }

        if(iNum == iNew){
            return true;
        }
        return false;
    }
}


class Armstrong {
    public static void main(String shubham[]){
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter any number to check wether number is armstrong or not : ");
        iNo = sobj.nextInt();

        Check obj = new Check();
        bRet = obj.checkArmstrong(iNo);

        if(bRet == true){
            System.out.println(iNo + " Number is armstrong.");
        }else{
            System.out.println(iNo + " Number is not armstrong.");
        }
    }
}
