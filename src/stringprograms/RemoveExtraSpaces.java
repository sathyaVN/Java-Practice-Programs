package stringprograms;

import java.util.Scanner;

public class RemoveExtraSpaces {
    public static void main (String[] args){
        Scanner scantext = new Scanner(System.in);
        System.out.println("Enter the sentence with spaces :");
        String inputString = scantext.nextLine();
        char[] inputStringArray = inputString.toCharArray();
        System.out.println(inputStringArray.length);

        String newString = inputString.trim();
        String outputString =newString.replace(" ","");
        System.out.println(outputString);
        withoutUsingTrimMethod();
    }

    public static void withoutUsingTrimMethod() {
        String inputString = "    Learning String Programs   ";
        char[] charArray = inputString.toCharArray();
        int origLength = charArray.length;
        System.out.println("origLength" +origLength);
        int firstIndex = 0;
        int lastIndex = 0;
        //traversing forward. Total length of string : 31. Index is from 0-30 (0 to length-1)
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                firstIndex = i;
                break;
            }
        }
        System.out.println("firstIndexstarts at :"+firstIndex);
        //traversing backward
        for (int j = origLength-1; j <= charArray.length; j--) {
            if (charArray[j] != ' ') {
                lastIndex = j;
                break;
            }

        }
        System.out.println("lastIndexstarts at :"+lastIndex);

        String finalStringWithoutSpaces = inputString.substring(4,28);
        System.out.println("i/p string"+":="+inputString);
        System.out.println("o/p string"+":="+finalStringWithoutSpaces);
    }
}
