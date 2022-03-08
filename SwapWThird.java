//Swap two numbers without third variable


public class SwapWThird {

    public static void main(String[] args) {
        
    
    int num1 = 10, num2 = 20;
    
    System.out.println("Before swaping num1 & num2 : " + num1 + " & " + num2);
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;

    System.out.println("After swaping num1 & num2 : " + num1 + " & " + num2);
    }
}
