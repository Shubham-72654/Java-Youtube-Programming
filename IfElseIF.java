// if else if (age => A = 20, B = 30, C = 40, D = 13, E = 6)
// accept age from user and return category of age group.
//  0-12 => child category
// 13-19 => teen category
// 20-40 => young category
// above 40 => old category

import java.util.Scanner;

class ChkAge{

    // if-eiseif condition
    public void Display(int iCheckAge){
        if(iCheckAge > 0 && iCheckAge <= 12){
            System.out.println("Your age group is in child category.");
        } else if(iCheckAge > 12 && iCheckAge <= 19){
            System.out.println("Your age group is in teen category.");
        } else if(iCheckAge > 19 && iCheckAge <= 40){
            System.out.println("Your age group is in young category.");
        } else if(iCheckAge > 40 && iCheckAge <= 150){
            System.out.println("Your age group is in old category.");
        } else {
            System.out.println("Please enter valid age.");
        }
    }

    // nested if
    public void nestedIf(int iNo){
        if(iNo > 0){
            if(iNo < 18){
                System.out.println("Your age is under 18");
            }
            if(iNo >= 18){
                System.out.println("Your are eligible for voting.");
                // A = 18-30 age
                // B = 30-50 age
                // C = above 50

                if(iNo <= 30){
                    System.out.println("Go to department A.");
                }
                if(iNo > 30 && iNo <= 50){
                    System.out.println("Go to department B.");
                }
                if(iNo > 50){
                    System.out.println("Go to department C.");
                }
            }
        }
    }
}

class IfElseIF {
    // entry point function
    public static void main(String arg[]){
        int iAge = 0;
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your age : ");
        iAge = sobj.nextInt();

        ChkAge cobj = new ChkAge();
        cobj.Display(iAge);

        System.out.println("Enter your age for check voting department : ");
        iNo = sobj.nextInt();
        cobj.nestedIf(iNo);
    }
}
