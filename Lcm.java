// LCM of two numbers
/*hint : 1. cmp 2 nums bcz lcm cnnt be smaller num betwn 2 nums
        2. lcm = largest num 
        3.check lcm divide by both nums or lcm++

*/
public class Lcm {
    public static void main(String[] args) {
        
        int num1 = 24, num2 = 3, lcm;

        lcm = (num1 > num2) ? num1 : num2;
        
        while(true){
            if(lcm % num1 == 0 && lcm % num2 == 0){
                System.out.println("LCM of " + num1 + " & " + num2 + " is " + lcm);
                break;
            }
            lcm++;
        }
        
        
    }    
}
