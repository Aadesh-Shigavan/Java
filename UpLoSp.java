//Uppercase, Lowercase or special character

public class UpLoSp {
    public static void main(String[] args) {
        
    
    char ch = '0';
    int asci = ch;

    if(asci >= 65 && asci <= 90){
        System.out.println("Char is UPPERCASE");

    }
    else if(asci >= 97 && asci <= 122){
        System.out.println("Char is lower case");
    }
    else if(asci >= 32 &&  asci <= 47){
        System.out.println("Char is Special character");
    }
    else{
        System.out.println("Char is not among above");
    }
}
}
