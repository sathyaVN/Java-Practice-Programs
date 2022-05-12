package stringprograms;

import java.util.Scanner;

public class StringOccurences {
    public static void main(String[] args){
        Scanner scantext = new Scanner(System.in);
        System.out.println("Enter the Sentence:");

        String inputSentence= scantext.nextLine();
        System.out.println("Need to find Occurence of which character?");
         String repeatedChar = scantext.nextLine();

        String replaceRepeatedChar= inputSentence.replace(repeatedChar,"");
        System.out.println(replaceRepeatedChar.length());
        int timesRepeated = inputSentence.length()-replaceRepeatedChar.length();
        System.out.println("Letter"+" "+repeatedChar+" "+"repeated"+" "+timesRepeated+" "+"times");



    }
}
