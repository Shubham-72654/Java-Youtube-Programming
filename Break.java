// explaination of break statement.

class Break {
    public static void main(String shubham[]){

        int i = 0;

        // dewas to indore = 40 km
        // 0-40km -> rukna (break)

        for(i = 1; i <= 50; i++){
            System.out.println(i + " KM");
            if(i == 40){
                System.out.println("You reached your destination, so take a break.");
                break;
            }
        }
    }
}
