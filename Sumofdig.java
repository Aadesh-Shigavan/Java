//Number of digits in an integer
/* 1. use condition while( num != 0) 
    2. num % 10 ---> last value of number
    3. add total sum 
    4. num / 10 ---> gives number except last digit
*/
public class Sumofdig {
    public static void main(String[] args) {
        
        int num = 71211;
        int totalSum = 0;
        
        while(num != 0){
            totalSum += num % 10;    
            num = num / 10;
        }

        System.out.println(totalSum);
    }
}
