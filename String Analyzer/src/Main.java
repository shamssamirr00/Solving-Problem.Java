import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        int num_of_characters = sentence.length();
        int num_of_words = 1 ;
        int num_of_vowels = 0 ;
        int num_of_consonants = 0 ;
        for (int i = 0; i < sentence.length() ; i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));
            if (ch == ' '){
                num_of_words ++ ;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||  ch == 'u') {
                num_of_vowels ++ ;
            }else if (ch >= 'a' && ch <= 'z') {
                num_of_consonants ++ ;
            }
        }
        System.out.println("Number of characters: " + num_of_characters);
        System.out.println("Number of words: " + num_of_words);
        System.out.println("Number of vowels: " + num_of_vowels);
        System.out.println("Number of consonants: " + num_of_consonants);
    }
}