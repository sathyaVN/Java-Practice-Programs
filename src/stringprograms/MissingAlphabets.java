package stringprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MissingAlphabets {
    public  static void main(String[] args){
        String inputString = "Practicing String Programs..";
        String[] strArry = inputString.split("");

        String alphabet[] ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z" };

        HashSet<String> strHashSet = new HashSet<>(Arrays.asList(strArry));
        HashSet<String> alphabetSet = new HashSet<>(Arrays.asList(alphabet));

        alphabetSet.removeAll(strHashSet);
        System.out.println("The missing alphabets from given inputString are =" +alphabetSet);


    }
}
