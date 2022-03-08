// A character is an alphabet or not

class Alphabet{
    public static void main(String[] args) {
        char ch = '1';
        if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println("Charcter is a Alphabet");
        }
        else{
            System.out.println("Charcter is NOT a Alphabet");
        }

    }
}