//  A character is a vowel or consonant

class CharVow{

    
    public static void main(String[] args) {
        char ch = 'c';
        if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U' ){
            System.out.println("Character is a Vowel");
        }
        else{
            System.err.println("Character is a Consonant");
        }
    }
}