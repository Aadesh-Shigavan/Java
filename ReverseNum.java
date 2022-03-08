// Reverse a given number

public class ReverseNum {
    public static void main(String[] args) {
        
        int num = 1231;
        String str = "";
        int rev = 0;

        while(num != 0){
            str += num % 10;
            num = num / 10;
        }

        System.out.println(str);
    }
}
