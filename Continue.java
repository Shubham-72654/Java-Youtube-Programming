// explaination of continue statement

class Continue {
    public static void main(String shubham[]){
        int i = 0;

        // we have 5500 note (in rupee)
        // we removed 500 rs notes

        for(i = 100; i <= 5500; i = i + 100){
            if(i % 500 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
