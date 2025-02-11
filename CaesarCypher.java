import java.util.Arrays;
import java.util.Scanner;

public class CaesarCypher {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int key;
        String plainText="", cypherText="";
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        System.out.print("Enter a message to encrypt: ");
        plainText = scan.nextLine();
        
        System.out.print("Enter shift number: ");
        key = scan.nextInt();

        for (int index = 0; index < plainText.length(); index++) {
            if(plainText.charAt(index)==' '){
                cypherText+=' ';
            }
            else{
                for (int i = 0; i < letters.length; i++) {
                    if (letters[i] == plainText.charAt(index)) {
                        cypherText+=letters[((i+key)%26)];
                    } 
                }
            } 
        }
        
        System.out.println("Encrypted Text: " + cypherText);

    }
        
}
