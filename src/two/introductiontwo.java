package two;
import java.util.*;
public class introductiontwo {
	
	boolean uniqueCharacters(String str) {

		char[] chArray = str.toCharArray();
        Arrays.sort(chArray);
        for (int i = 0; i < chArray.length - 1; i++) {
        	if (chArray[i] != chArray[i + 1])
                continue;
        	else
                return false;
        }
        return true;

	}
	
	public static void main(String args[]) {
        introductiontwo obj = new introductiontwo();
        String input = "Blade";
 
        if (obj.uniqueCharacters(input))
            System.out.println("The String " + input + " has all unique characters");
                               
        else
            System.out.println("The String " + input + " has duplicate characters");
    }
}