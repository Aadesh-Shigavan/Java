// Total Digits in a Number

public class TotalDig {
    public static void main(String[] args) {
        int count = 0,temp = 0;
        int number = 1234547;

        while(number != 0){
            temp = number % 10;
            number = number / 10;
            count++;
        }

        System.out.println("Total Digits in Number : " + count);
    }
}
