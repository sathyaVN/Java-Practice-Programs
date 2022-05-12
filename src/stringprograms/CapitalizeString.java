package stringprograms;

import java.util.Scanner;

public class CapitalizeString {
    public static void main(String[] args) {
        Scanner scantext = new Scanner(System.in);
        System.out.println("Enter the String to capitalize each word::");
        String inputSentence = scantext.nextLine();

        String[] sentenceArray = inputSentence.split(" ");
        System.out.println("Total number of words in a given sentence::" + sentenceArray.length);

        for (int i = 0; i < sentenceArray.length; i++) {
            String outputString = sentenceArray[i].substring(0, 1).toUpperCase() + sentenceArray[i].substring(1, sentenceArray[i].length());
            System.out.print(outputString);
            System.out.print(" ");
        }
    }
}