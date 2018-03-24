import java.util.*;
public class WordCapitalization{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String stringChecker = sc.next(), correctedString = "";
        if(Character.isLowerCase(stringChecker.charAt(0)) == true){
            correctedString += Character.toUpperCase(stringChecker.charAt(0));
            for(int i = 1; i < stringChecker.length(); i++) correctedString += stringChecker.charAt(i);
            System.out.println(correctedString);
        } else System.out.println(stringChecker);
	}
}