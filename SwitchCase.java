// for exploring Switch case statement
// accept source and destination from user and provide train and ticket fare information to user.

import java.util.Scanner;

class Bill{
    public void TrainTicket(int iNo){
        switch (iNo) {
            case 1:
                System.out.println("Your train number is 14325 and ticekt fare is 50rs.");
                break;
            case 2:
                System.out.println("Your train number is 14658 and ticekt fare is 800rs.");
                break;
            case 3:
                System.out.println("Your train number is 17854 and ticekt fare is 250rs.");
                break;
            case 4:
                System.out.println("Your train number is 85476 and ticekt fare is 450rs.");
                break;
            case 5:
                System.out.println("Your train number is 98547 and ticekt fare is 580rs.");
                break;
        
            default:
                System.out.println("Please choose above options only.");
                break;
        }
    }
}

class SwitchCase {
    public static void main(String a[]){
        int iNo = 0;
        
        System.out.println("Welcome to Indian Railway.");
        System.out.println("Choose your destination.");
        System.out.println("1: Indore to Dewas");
        System.out.println("2: Indore to Jabalpur");
        System.out.println("3: Indore to Bhopal");
        System.out.println("4: Indore to Pune");
        System.out.println("5: Indore to Mumbai");
        System.out.println("*******************************************************");
        Scanner sobj = new Scanner(System.in);
        iNo = sobj.nextInt();

        Bill bobj = new Bill();
        bobj.TrainTicket(iNo);
    }

}
